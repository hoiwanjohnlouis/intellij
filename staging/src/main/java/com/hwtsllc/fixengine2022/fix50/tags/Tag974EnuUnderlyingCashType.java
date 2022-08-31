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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.FIX50Abstract;
import com.hwtsllc.fixengine2022.fix50.enums.Enum974UnderlyingCashType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  974
 *  UnderlyingCashType
 *  String
 *  <p>
 *  Specific to the &lt;UnderlyingInstrument&gt; Used for derivatives that deliver into cash underlying.
 *  <p></p>
 *  Valid values:
 *  <p>    FIXED - FIXED
 *  <p>    DIFF - DIFF
 */
public class Tag974EnuUnderlyingCashType extends FIX50Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum974UnderlyingCashType dataValue;

    public final static Enum974UnderlyingCashType TESTA_ENU_UNDERLYING_CASH_TYPE
            = Enum974UnderlyingCashType.DIFF;
    public final static Enum974UnderlyingCashType TESTB_ENU_UNDERLYING_CASH_TYPE
            = Enum974UnderlyingCashType.FIXED;

    public Tag974EnuUnderlyingCashType(Enum974UnderlyingCashType dataValue) {
        setFixType(FIX50.FIX974_ENU_UNDERLYING_CASH_TYPE);
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
                .concat("\n\tDataID[")
                .concat(toDataIDString())
                .concat("]")
                .concat("\n\tDataName[")
                .concat(toDataNameString())
                .concat("]")
                .concat("\n\tDataDescription[")
                .concat(toDataDescriptionString())
                .concat("]")
                ;
    }
    /**
     * wrapper to return the ID of the underlying Data
     */
    @Override
    public String toDataIDString() {
        return dataValue.toEnumIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return dataValue.toEnumNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return dataValue.toEnumDescriptionString();
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
        Tag974EnuUnderlyingCashType tagData;

        tagData = new Tag974EnuUnderlyingCashType(TESTA_ENU_UNDERLYING_CASH_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag974EnuUnderlyingCashType(TESTB_ENU_UNDERLYING_CASH_TYPE);
        System.out.println(tagData.toVerboseString());
    }
}
