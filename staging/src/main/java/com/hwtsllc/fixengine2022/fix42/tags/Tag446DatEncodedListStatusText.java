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
 *  446
 *  EncodedListStatusText
 *  data
 *  <p></p>
 *  Encoded (non-ASCII characters) representation of the ListStatusText (444) field
 *  in the encoded format specified via the MessageEncoding (347) field.
 *  <p></p>
 *  If used, the ASCII (English) representation should also be specified in the ListStatusText field.
 */
public class Tag446DatEncodedListStatusText extends FIX42Abstract implements LogValuePairString, LogVerboseString {
    private final MyDataType dataValue;

    public final static String TESTA_DAT_LIST_STATUS_ENCODED_TEXT
            = "LeslieCaron-Tag446DatEncodedListStatusText";
    public final static String TESTB_DAT_LIST_STATUS_ENCODED_TEXT
            = "LeslieClaireMargaretCaron-Tag446DatEncodedListStatusText";

    public Tag446DatEncodedListStatusText(MyDataType dataValue) {
        setFixType(FIX42.FIX446_DAT_LIST_STATUS_ENCODED_TEXT);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
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
        Tag446DatEncodedListStatusText tagData;

        tagData= new Tag446DatEncodedListStatusText(new MyDataType(TESTA_DAT_LIST_STATUS_ENCODED_TEXT) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag446DatEncodedListStatusText(new MyDataType(TESTB_DAT_LIST_STATUS_ENCODED_TEXT) );
        System.out.println(tagData.toVerboseString());
    }
}
