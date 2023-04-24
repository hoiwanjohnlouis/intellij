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
import com.hwtsllc.fixengine2022.fix27.enums.Enum13CommType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  13
 *  CommType
 *  char
 *  <p></p>
 *  Commission type
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Per Unit (implying shares, par, currency, etc.)
 *  <p>    2 - Percent
 *  <p>    3 - Absolute (total monetary amount)
 *  <p>    4 - Percentage waived - cash discount (for CIV buy orders)
 *  <p>    5 - Percentage waived -= enhanced units (for CIV buy orders)
 *  <p>    6 - Points per bond or contract
 *          (supply ContractMultiplier (231) in the <Instrument> component block
 *           if the object security is denominated in a size other than the
 *           industry default - 1000 par for bonds)
 */
public class Tag13EnuCommType extends FIX27Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum13CommType dataValue;

    public final static Enum13CommType TESTA_ENU_COMMISSION
            = Enum13CommType.PER_UNIT;
    public final static Enum13CommType TESTB_ENU_COMMISSION
            = Enum13CommType.POINTS_PER_BOND;

    public Tag13EnuCommType(Enum13CommType dataValue) {
        setFixType(FIX27.FIX13_ENU_COMM_TYPE);
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
        System.out.println( new Tag13EnuCommType(TESTA_ENU_COMMISSION).toVerboseString() );
        System.out.println( new Tag13EnuCommType(TESTB_ENU_COMMISSION).toVerboseString() );

        // loop around the ENUM and display
        for (Enum13CommType oneEnum : Enum13CommType.values()) {
            System.out.println( new Tag13EnuCommType(oneEnum).toVerboseString() );
        }
    }
}
