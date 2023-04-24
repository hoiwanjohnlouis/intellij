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

package com.hwtsllc.fixengine.tags.fix27;

import com.hwtsllc.fixengine.datatypes.FIX27;
import com.hwtsllc.fixengine.datatypes.FIX27Abstract;
import com.hwtsllc.fixengine.enums.fix27.Enum81ProcessCode;
import com.hwtsllc.fixengine.interfaces.LogDataString;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  81
 *  ProcessCode
 *  char
 *  <p></p>
 *  Processing code for sub-account.
 *  <p></p>
 *  Absence of this field in AllocAccount (79), AllocPrice (366),
 *  <p></p>
 *  AllocQty (80), ProcessCode instance indicates regular trade.
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Regular
 *  <p>    1 - Soft Dollar
 *  <p>    2 - Step-In
 *  <p>    3 - Step-Out
 *  <p>    4 - Soft-dollar Step-In
 *  <p></p>
 *  <p>    5 - Soft-dollar Step-Out
 *  <p>    6 - Plan Sponsor
 */
public class Tag81EnuProcessCode extends FIX27Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum81ProcessCode dataValue;

    public final static Enum81ProcessCode TESTA_ENU_PROCESS_CODE
            = Enum81ProcessCode.REGULAR;
    public final static Enum81ProcessCode TESTB_ENU_PROCESS_CODE
            = Enum81ProcessCode.PLAN_SPONSOR;

    public Tag81EnuProcessCode(Enum81ProcessCode dataValue) {
        setFixType(FIX27.FIX81_ENU_PROCESS_CODE);
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
        System.out.println( new Tag81EnuProcessCode(TESTA_ENU_PROCESS_CODE).toVerboseString() );
        System.out.println( new Tag81EnuProcessCode(TESTB_ENU_PROCESS_CODE).toVerboseString() );

        // loop around the ENUM and display
        for (Enum81ProcessCode oneEnum : Enum81ProcessCode.values()) {
            System.out.println( new Tag81EnuProcessCode(oneEnum).toVerboseString() );
        }
    }
}