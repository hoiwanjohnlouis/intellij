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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.FIX43Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyStringType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  548
 *  CrossID
 *  String
 *  <p>
 *  Identifier for a cross order.
 *  <p>
 *  Must be unique during a given trading day.
 *  <p>
 *  Recommend that firms use the order date as part of the CrossID for Good Till Cancel (GT) orders.
 */
public class Tag548StrCrossID extends FIX43Abstract implements LogValuePairString, LogVerboseString {
    private final MyStringType dataValue;

    public final static String TESTA_STR_CROSS_ID
            = "BilboBaggins-Tag548StrCrossID";
    public final static String TESTB_STR_CROSS_ID
            = "Gandalf-Tag548StrCrossID";

    public Tag548StrCrossID(MyStringType dataValue) {
        setFixType(FIX43.FIX548_STR_CROSS_ID);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getDataValue();
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
                .concat("]");
    }
    /**
     * standard wrapper to format a simple string describing the data
     */
    @Override
    public String toString() {
        return String.valueOf(getDataValue());
    }

    /**
     *
     * @param args   no args used at this time
     */
    public static void main(String[] args) {
        Tag548StrCrossID tagData;

        tagData = new Tag548StrCrossID(new MyStringType(TESTA_STR_CROSS_ID) );
        System.out.println(tagData.toVerboseString());

        tagData = new Tag548StrCrossID(new MyStringType(TESTB_STR_CROSS_ID) );
        System.out.println(tagData.toVerboseString());
    }
}
