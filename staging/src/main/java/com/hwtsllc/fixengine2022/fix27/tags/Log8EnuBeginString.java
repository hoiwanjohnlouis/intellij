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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.FIX27Abstract;
import com.hwtsllc.fixengine2022.fix27.enums.Enum8BeginString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  8
 *  BeginString
 *  String
 *  Identifies beginning of new message and protocol version.
 *  ALWAYS FIRST FIELD IN MESSAGE.
 *  ALWAYS UNENCRYPTED.
 *  Valid values:
 *
 *      FIX.2.7
 *      FIX.3.0
 *      FIX.4.0
 *      FIX.4.1
 *      FIX.4.2
 *
 *      FIX.4.3
 *      FIX.4.4
 *      FIXT.1.1
 */
public class Log8EnuBeginString extends FIX27Abstract implements LogValuePairString, LogVerboseString {
    private final Enum8BeginString dataValue;

    public final static Enum8BeginString TESTA_ENU_BEGIN_STRING = Enum8BeginString.BEGIN_STRING_2_7;
    public final static Enum8BeginString TESTB_ENU_BEGIN_STRING = Enum8BeginString.BEGIN_STRING_4_0;

    public Log8EnuBeginString(Enum8BeginString dataValue) {
        setFixType(FIX27.FIX8_ENU_BEGIN_STRING);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return getID()
                .concat("=")
                .concat(getDataValue());
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
        Log8EnuBeginString tagData;

        tagData = new Log8EnuBeginString(TESTA_ENU_BEGIN_STRING);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Log8EnuBeginString(TESTB_ENU_BEGIN_STRING);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
