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
import com.hwtsllc.fixengine2022.fix43.enums.Enum587LegSettlType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  587
 *  LegSettlType
 *  char
 *  <p></p>
 *  Refer to values for SettlType[63]
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Regular / FX Spot settlement (T+1 or T+2 depending on currency)
 *  <p>    1 - Cash (TOD / T+0)
 *  <p>    2 - Next Day (TOM / T+1)
 *  <p>    3 - T+2
 *  <p>    4 - T+3
 *  <p></p>
 *  <p>    5 - T+4
 *  <p>    6 - Future
 *  <p>    7 - When And If Issued
 *  <p>    8 - Sellers Option
 *  <p>    9 - T+5
 *  <p></p>
 *  <p>    B - Broken date - for FX expressing non-standard tenor, SettlDate (64) must be specified
 *  <p>    C - FX Spot Next settlement (Spot+1, aka next day)
 */
public class Tag587EnuLegSettlType extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum587LegSettlType dataValue;

    public final static Enum587LegSettlType TESTA_ENU_LEG_SETTL_TYPE
            = Enum587LegSettlType.BROKEN_DATE;
    public final static Enum587LegSettlType TESTB_ENU_LEG_SETTL_TYPE
            = Enum587LegSettlType.REGULAR;

    public Tag587EnuLegSettlType(Enum587LegSettlType dataValue) {
        setFixType(FIX43.FIX587_ENU_LEG_SETTL_TYPE);
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
        return dataValue.toFIXDescriptionString();
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
        Tag587EnuLegSettlType tagData;

        tagData = new Tag587EnuLegSettlType(TESTA_ENU_LEG_SETTL_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag587EnuLegSettlType(TESTB_ENU_LEG_SETTL_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum587LegSettlType oneEnum : Enum587LegSettlType.values()) {
            System.out.println( new Tag587EnuLegSettlType(oneEnum).toVerboseString() );
        }
    }
}
