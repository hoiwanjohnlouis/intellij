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

package com.hwtsllc.fixengine2022.fix42.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX42;
import com.hwtsllc.fixengine2022.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyDataType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  361
 *  EncodedAllocText
 *  data
 *  <p></p>
 *  Encoded (non-ASCII characters) representation of the AllocText (161) field
 *  in the encoded format specified via the MessageEncoding (347) field.
 *  <p></p>
 *  If used, the ASCII (English) representation should also be specified in the AllocText field.
 */
public class Tag361DatEncodedAllocText extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyDataType dataValue;

    public final static String TESTA_DAT_ENCODED_ALLOC_TEXT
            = "ShelleyWinters-Tag361DatEncodedAllocText";
    public final static String TESTB_DAT_ENCODED_ALLOC_TEXT
            = "ShirleySchrift-Tag361DatEncodedAllocText";

    public Tag361DatEncodedAllocText(MyDataType dataValue) {
        setFixType(FIX42.FIX361_DAT_ENCODED_ALLOC_TEXT);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toEnumIDString()
                .concat("=")
                .concat(dataValue.toString());
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
        return dataValue.toString();
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag361DatEncodedAllocText tagData;

        tagData= new Tag361DatEncodedAllocText(new MyDataType(TESTA_DAT_ENCODED_ALLOC_TEXT) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag361DatEncodedAllocText(new MyDataType(TESTB_DAT_ENCODED_ALLOC_TEXT) );
        System.out.println(tagData.toVerboseString());
    }
}
