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

package com.hwtsllc.fixengine.tags.fix40;

import com.hwtsllc.fixengine.datatypes.FIX40;
import com.hwtsllc.fixengine.datatypes.FIX40Abstract;
import com.hwtsllc.fixengine.enums.fix40.Enum139MiscFeeType;
import com.hwtsllc.fixengine.interfaces.LogDataString;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  139
 *  MiscFeeType
 *  String
 *  <p></p>
 *  Indicates type of miscellaneous fee.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Regulatory (e.g. SEC)
 *  <p>    2 - Tax
 *  <p>    3 - Local Commission
 *  <p>    4 - Exchange Fees
 *  <p>    5 - Stamp
 *  <p></p>
 *  <p>    6 - Levy
 *  <p>    7 - Other
 *  <p>    8 - Markup
 *  <p>    9 - Consumption Tax
 *  <p>    10 - Per transaction
 *  <p></p>
 *  <p>    11 - Conversion
 *  <p>    12 - Agent
 *  <p>    13 - Transfer Fee
 *  <p>    14 - Security Lending
 */
public class Tag139EnuMiscFeeType extends FIX40Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum139MiscFeeType dataValue;

    public final static Enum139MiscFeeType TESTA_ENU_MISC_FEE_TYPE
            = Enum139MiscFeeType.REGULATORY;
    public final static Enum139MiscFeeType TESTB_ENU_MISC_FEE_TYPE
            = Enum139MiscFeeType.TRANSFER_FEE;

    public Tag139EnuMiscFeeType(Enum139MiscFeeType dataValue) {
        setFixType(FIX40.FIX139_ENU_MISC_FEE_TYPE);
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
        System.out.println( new Tag139EnuMiscFeeType(TESTA_ENU_MISC_FEE_TYPE).toVerboseString() );
        System.out.println( new Tag139EnuMiscFeeType(TESTB_ENU_MISC_FEE_TYPE).toVerboseString() );

        // loop around the ENUM and display
        for (Enum139MiscFeeType oneEnum : Enum139MiscFeeType.values()) {
            System.out.println( new Tag139EnuMiscFeeType(oneEnum).toVerboseString() );
        }
    }
}
