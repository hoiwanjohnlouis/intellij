/*
 * Copyright (c) 2022.  HW Tech Services, LLC
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.hwtsllc.fixengine.tags.fix27.tags;

import com.hwtsllc.fixengine.datatypes.FIX27;
import com.hwtsllc.fixengine.datatypes.FIX27Abstract;
import com.hwtsllc.fixengine.datatypes.MyStringType;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  72
 *  RefAllocID
 *  String
 *  <p></p>
 *  Reference identifier to be used with AllocTransType (71) = Replace or Cancel.
 *  <p></p>
 *  (Prior to FIX 4.1 this field was of type int)
 */
public class Tag72StrRefAllocID extends FIX27Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_REF_ALLOC_ID
            = "OliviaDeHavilland-Tag72StrRefAllocID";
    public final static String TESTB_STR_REF_ALLOC_ID
            = "VirginiaMayo-Tag72StrRefAllocID";

    public Tag72StrRefAllocID(MyStringType dataValue) {
        setFixType(FIX27.FIX72_STR_REF_ALLOC_ID);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
                .concat("=")
                .concat(this.dataValue.toString());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return super.toVerboseString()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]")
                .concat("\n\tValuePair[")
                .concat(toValuePairString())
                .concat("]")
                ;
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return this.dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        System.out.println( new Tag72StrRefAllocID(new MyStringType(TESTA_STR_REF_ALLOC_ID)).toVerboseString() );
        System.out.println( new Tag72StrRefAllocID(new MyStringType(TESTB_STR_REF_ALLOC_ID)).toVerboseString() );
    }
}