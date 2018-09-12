using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Java_;
using Ecore.Xmi;

namespace JavaTest
{

    

    [TestClass]
    public class OCLBenchmark
    {
        [TestInitialize]
        public void setup()
        {
            Java_PackageImpl.init();

            var resource = new XmiResource(Java_PackageImpl.eINSTANCE, Java_FactoryImpl.eINSTANCE);

            var model = resource.Load("C:/Users/Simon/Data/git2/examples-java/crossecore-java/resources/org.eclipse.gmt.modisco.java.kyanos.xmi") as Model;



        }

        [TestMethod]
        public void thrownExceptions()
        {

            ClassDeclarationImpl.allInstances()
                .collect<BodyDeclaration>(cd => cd.bodyDeclarations)
                .select(each => each is MethodDeclaration)
                .collect<TypeAccess>(each => (each as MethodDeclaration).thrownExceptions)
                .asSequence();

        }

        [TestMethod]
        public void emptyTextElementInJavadoc()
        {
            Model model = null;
            model.compilationUnits.collect<Comment>(cu => cu.commentList)
		    .select(each => each is Javadoc)
		    .collect<ASTNode>(o => (o as Javadoc).tags
            .collect<ASTNode>(t => t.fragments))
		    .select(each => each is TextElement)
		    .asSequence();
        }

        [TestMethod]
        public void textElementInJavadoc()
        {
            Model model = null;
            model.compilationUnits.collect<Comment>(cu => cu.commentList)
            .select(each => each is Javadoc)
            .collect<ASTNode>(o => (o as Javadoc).tags
            .collect<ASTNode>(t => t.fragments))
            .select(each => each is TextElement)
            .select(each => (each as TextElement).text.Length == 0)
            .asSequence();

        }

        [TestMethod]
        public void invisibleMethods()
        {
            var result1 = ClassDeclarationImpl.allInstances();

            var result2 = ClassDeclarationImpl.allInstances()
                .collect<BodyDeclaration>(cd => cd.bodyDeclarations);

            var result3 = ClassDeclarationImpl.allInstances()
                .collect<BodyDeclaration>(cd => cd.bodyDeclarations)
                .select(each => each is MethodDeclaration);

            var result4 = ClassDeclarationImpl.allInstances()
                .collect<BodyDeclaration>(cd => cd.bodyDeclarations)
                .select(each => each is MethodDeclaration)
                .select(each =>
                !(each.modifier == null)
                && !(each.modifier.visibility == null)
                && (each.modifier.visibility == VisibilityKind.PRIVATE || each.modifier.visibility == VisibilityKind.PROTECTED));

            var result = ClassDeclarationImpl.allInstances()
                .collect<BodyDeclaration>(cd => cd.bodyDeclarations)
		        .select(each => each is MethodDeclaration)
		        .select(each => 
			    ! (each.modifier==null) 
			    && !(each.modifier.visibility == null) 
			    && (each.modifier.visibility == VisibilityKind.PRIVATE || each.modifier.visibility == VisibilityKind.PROTECTED))
		        .asSequence();

            

        }

        [TestMethod]
        public void grabats09()
        {
            TypeDeclarationImpl.allInstances().
                select(each => each.bodyDeclarations.
                exists(bd=>
                bd is MethodDeclaration
                && (!(bd.modifier == null))
                && bd.modifier.static_
                && (!((bd as MethodDeclaration).returnType == null))
                && (bd as MethodDeclaration).returnType.type == each
                )).asSequence();

        }
    }
}
