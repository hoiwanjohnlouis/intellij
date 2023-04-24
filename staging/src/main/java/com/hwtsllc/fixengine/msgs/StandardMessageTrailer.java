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

package com.hwtsllc.fixengine.msgs;

import com.hwtsllc.fixengine.datatypes.MyDataType;
import com.hwtsllc.fixengine.datatypes.MyLengthType;
import com.hwtsllc.fixengine.datatypes.MyStringType;
import com.hwtsllc.fixengine.tags.fix27.Tag10StrCheckSum;
import com.hwtsllc.fixengine.tags.fix27.Tag89DatSignature;
import com.hwtsllc.fixengine.tags.fix27.Tag93LenSignatureLength;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

public class StandardMessageTrailer implements LogValuePairString, LogVerboseString {
    // Tags in sequential order
    private final Tag89DatSignature tag89DatSignature;
    private final Tag93LenSignatureLength tag93LenSignatureLength;
    private final Tag10StrCheckSum tag10StrCheckSum;

    private StandardMessageTrailer( BuildTrailer builder ) {
        this.tag89DatSignature = builder.tag89DatSignature;
        this.tag93LenSignatureLength = builder.tag93LenSignatureLength;
        this.tag10StrCheckSum = builder.tag10StrCheckSum;
    }

    // Getters in sequential order
    public Tag89DatSignature getTag89DatSignature() {
        return this.tag89DatSignature;
    }
    public Tag93LenSignatureLength getTag93LenSignatureLength() {
        return this.tag93LenSignatureLength;
    }
    public Tag10StrCheckSum getTag10StrCheckSum() {
        return this.tag10StrCheckSum;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return tag89DatSignature.toValuePairString()
                .concat(" ")
                .concat(tag93LenSignatureLength.toValuePairString())
                .concat(" ")
                .concat(tag10StrCheckSum.toValuePairString())
        ;
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toVerboseString() {
        return this.getClass().getSimpleName()
                .concat("\n")
                .concat(tag89DatSignature.toVerboseString())
                .concat("\n")
                .concat(tag93LenSignatureLength.toVerboseString())
                .concat("\n")
                .concat(tag10StrCheckSum.toVerboseString())
        ;
    }

    // BuildHeader for trailer
    public static class BuildTrailer {
        private Tag89DatSignature tag89DatSignature;
        private Tag93LenSignatureLength tag93LenSignatureLength;
        private final Tag10StrCheckSum tag10StrCheckSum;

        // tag10 is always required. MAIN
        public BuildTrailer( Tag10StrCheckSum parameter ) {
            this.tag10StrCheckSum = parameter;
        }
        // tag89 is optional
        public BuildTrailer signature( Tag89DatSignature parameter ) {
            this.tag89DatSignature = parameter;
            return this;
        }
        // tag93 is optional
        public BuildTrailer signatureLength( Tag93LenSignatureLength parameter ) {
            this.tag93LenSignatureLength = parameter;
            return this;
        }
        // build puts it all together
        public StandardMessageTrailer build() {
            return new StandardMessageTrailer( this );
        }
    }

    public static void main( String[] args ) {
        System.out.println("");
        Tag89DatSignature tag89Dat;
        Tag93LenSignatureLength tag93Len;
        Tag10StrCheckSum tag10Str;
//        String delimiter = "\\u001";
        // initialize trailer tags
        tag89Dat = new Tag89DatSignature( new MyDataType( Tag89DatSignature.TESTB_DAT_SIGNATURE ) );
        tag93Len = new Tag93LenSignatureLength( new MyLengthType( Tag93LenSignatureLength.TESTB_LEN_SIGNATURE_LENGTH ) );
        tag10Str = new Tag10StrCheckSum( new MyStringType( Tag10StrCheckSum.TESTB_STR_CHECK_SUM ) );
        StandardMessageTrailer smt =
                new BuildTrailer( tag10Str )
                        .signature(tag89Dat)
                        .signatureLength(tag93Len)
                        .build();
        System.out.println(smt.getTag10StrCheckSum());
        System.out.println(smt.toVerboseString());
        System.out.println(smt.toValuePairString());
        System.out.println('1');
    }
}
