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
import com.hwtsllc.fixengine2022.fix50.enums.Enum975UnderlyingSettlementType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  975
 *  UnderlyingSettlementType
 *  int
 *  <p>
 *  Indicates order settlement period for the underlying instrument.
 *  <p></p>
 *  Valid values:
 *  <p>    2 - T+1
 *  <p>    4 - T+3
 *  <p>    5 - T+4
 */
public class Tag975EnuUnderlyingSettlementType extends FIX50Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum975UnderlyingSettlementType dataValue;

    public final static Enum975UnderlyingSettlementType TESTA_ENU_UNDERLYING_SETTLEMENT_TYPE
            = Enum975UnderlyingSettlementType.T_PLUS_1;
    public final static Enum975UnderlyingSettlementType TESTB_ENU_UNDERLYING_SETTLEMENT_TYPE
            = Enum975UnderlyingSettlementType.T_PLUS_4;

    public Tag975EnuUnderlyingSettlementType(Enum975UnderlyingSettlementType dataValue) {
        setFixType(FIX50.FIX975_ENU_UNDERLYING_SETTLEMENT_TYPE);
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
        Tag975EnuUnderlyingSettlementType tagData;

        tagData = new Tag975EnuUnderlyingSettlementType(TESTA_ENU_UNDERLYING_SETTLEMENT_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag975EnuUnderlyingSettlementType(TESTB_ENU_UNDERLYING_SETTLEMENT_TYPE);
        System.out.println(tagData.toVerboseString());
    }
}
