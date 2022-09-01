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
import com.hwtsllc.fixengine2022.fix42.enums.Enum286OpenCLoseSettlFlag;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  286
 *  OpenCloseSettleFlag
 *  MultipleCharValue
 *  <p>
 *  Flag that identifies a market data entry. (Prior to FIX 4.3 this field was of type char)
 *  <p></p>
 *  Valid values:
 *  <p>    0-5 msg types
 *  <p>    "0 - Daily Open / Close / Settlement entry"
 *  <p>    "1 - Session Open / Close / Settlement entry"
 *  <p>    "2 - Delivery Settlement entry"
 *  <p>    "3 - Expected entry"
 *  <p>    "4 - Entry from previous business day"
 *  <p>    "5 - Theoretical Price value"
 */
public class Tag286EnuOpenCloseSettleFlag extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum286OpenCLoseSettlFlag dataValue;

    public final static Enum286OpenCLoseSettlFlag TESTA_ENU_OPEN_CLOSE_SETTLE_FLAG
            = Enum286OpenCLoseSettlFlag.DAILY_OPEN_OR_CLOSE_OR_SETTLEMENT;
    public final static Enum286OpenCLoseSettlFlag TESTB_ENU_OPEN_CLOSE_SETTLE_FLAG
            = Enum286OpenCLoseSettlFlag.SESSION_OPEN_OR_CLOSE_OR_SETTLEMENT;

    public Tag286EnuOpenCloseSettleFlag(Enum286OpenCLoseSettlFlag dataValue) {
        setFixType(FIX42.FIX286_ENU_OPEN_CLOSE_SETTLE_FLAG);
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
        return dataValue.toFIXIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return dataValue.toFIXNameString();
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
        Tag286EnuOpenCloseSettleFlag tagData;

        tagData = new Tag286EnuOpenCloseSettleFlag(TESTA_ENU_OPEN_CLOSE_SETTLE_FLAG);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag286EnuOpenCloseSettleFlag(TESTB_ENU_OPEN_CLOSE_SETTLE_FLAG);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Enum286OpenCLoseSettlFlag oneEnum : Enum286OpenCLoseSettlFlag.values()) {
            System.out.println( new Tag286EnuOpenCloseSettleFlag(oneEnum).toVerboseString() );
        }
    }
}
