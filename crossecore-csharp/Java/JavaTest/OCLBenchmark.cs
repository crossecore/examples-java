using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Java_;

namespace JavaTest
{
    [TestClass]
    public class OCLBenchmark
    {
        [TestMethod]
        public void thrownExceptions()
        {

            ClassDeclarationImpl.allInstances
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
            ClassDeclarationImpl.allInstances
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
            TypeDeclarationImpl.allInstances.
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
