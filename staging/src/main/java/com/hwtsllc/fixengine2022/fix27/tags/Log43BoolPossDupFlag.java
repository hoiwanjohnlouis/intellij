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
import com.hwtsllc.fixengine2022.datatypes.MyBooleanType;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  43
 *  PossDupFlag
 *  Boolean
 *  Indicates possible retransmission of message with this sequence number
 *  Valid values:
 *      N - Original transmission
 *      Y - Possible duplicate
 */
public class Log43BoolPossDupFlag extends FIX27Abstract implements LogValuePairString, LogVerboseString {
    private final MyBooleanType dataValue;

    public final static MyBooleanType TESTA_BOOL_POSS_DUP_FLAG = MyBooleanType.NO; // fake data
    public final static MyBooleanType TESTB_BOOL_POSS_DUP_FLAG = MyBooleanType.YES;

    public Log43BoolPossDupFlag(MyBooleanType dataValue) {
        setFixType(FIX27.FIX43_BOOL_POSS_DUP_FLAG);
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
        Log43BoolPossDupFlag tagData;

        tagData = new Log43BoolPossDupFlag(TESTA_BOOL_POSS_DUP_FLAG);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Log43BoolPossDupFlag(TESTB_BOOL_POSS_DUP_FLAG);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
