using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Ecore
{
    public class MyClassBase : BasicEObjectImpl
    {

        protected EMap<String, String> manyStringToString_;


        public EMap<String, String> manyStringToString
        {
            get{ 
                if (manyStringToString_ == null)
                {
                    manyStringToString_ = new EcoreEMap<String, String>(new EClassImpl(), typeof(EStringToStringMapEntryImpl), this, 2);
		        }
		        return manyStringToString;
            }
        }


        public override Object eGet(int featureID, bool resolve, bool coreType)
        {
            switch (featureID)
            {

                case 1:
                    if (coreType) return manyStringToString_;
                    else return manyStringToString_.map();


            }
            return base.eGet(featureID, resolve, coreType);
        }


        public override void eSet(int featureID, object newValue)
        {
            switch (featureID)
            {

                case 1:
                    ((EcoreEMap<string, string>)manyStringToString_).set(newValue);
                    return;

            }
            base.eSet(featureID, newValue);
        }

        public override bool eIsSet(int featureID)
        {
            switch (featureID)
            {


                case 1:
                    return manyStringToString != null && !manyStringToString.isEmpty();


            }
            return base.eIsSet(featureID);
        }

    }

    
}
