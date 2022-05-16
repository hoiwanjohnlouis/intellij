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
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
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
public class Tag43BoolPossDupFlag extends FIX27Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final MyBooleanType dataValue;

    public final static MyBooleanType TESTA_BOOL_POSS_DUP_FLAG
            = MyBooleanType.NO;
    public final static MyBooleanType TESTB_BOOL_POSS_DUP_FLAG
            = MyBooleanType.YES;

    public Tag43BoolPossDupFlag(MyBooleanType dataValue) {
        setFixType(FIX27.FIX43_BOOL_POSS_DUP_FLAG);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.toFIXIDString();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toFIXIDString()
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
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return this.dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.toFIXNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.toFIXDescriptionString();
    }
    /**
     * standard wrapper to return a string describing the data
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
        dumpDataValues(new Tag43BoolPossDupFlag(TESTA_BOOL_POSS_DUP_FLAG));
        dumpDataValues(new Tag43BoolPossDupFlag(TESTB_BOOL_POSS_DUP_FLAG));
    }
    static void dumpDataValues(Tag43BoolPossDupFlag tagData) {
        System.out.println("-------------------- Start Boolean --------------------");
        System.out.println("VerboseString:" + tagData.toVerboseString());
        System.out.println("Accessing FIXTag Directly:");
        System.out.println("TagDataString:" + tagData);
        System.out.println("EnumNameString:" + tagData.toEnumNameString());
        System.out.println("FIXIDString:" + tagData.toFIXIDString());
        System.out.println("FIXNameString:" + tagData.toFIXNameString());
        System.out.println("FIXDescriptionString:" + tagData.toFIXDescriptionString());
        System.out.println("DataIDString:" + tagData.toDataIDString());
        System.out.println("DataNameString:" + tagData.toDataNameString());
        System.out.println("DataDescriptionString:" + tagData.toDataDescriptionString());
        System.out.println("ValuePairString:" + tagData.toValuePairString());
        System.out.println("-------------------- End Boolean --------------------");
    }
}
