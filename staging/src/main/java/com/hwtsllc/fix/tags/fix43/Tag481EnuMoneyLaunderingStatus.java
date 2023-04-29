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

package com.hwtsllc.fix.tags.fix43;

import com.hwtsllc.fix.datatypes.FIX43;
import com.hwtsllc.fix.datatypes.FIX43Abstract;
import com.hwtsllc.fix.enums.fix43.Enum481MoneyLaunderingStatus;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  481
 *  MoneyLaunderingStatus
 *  char
 *  <p></p>
 *  A one character code identifying Money laundering status.
 *  <p></p>
 *  Valid values:
 *  <p>    Y - Passed
 *  <p>    N - Not Checked
 *  <p>    1 - Exempt - Below the Limit
 *  <p>    2 - Exempt - Client Money Type exemption
 *  <p>    3 - Exempt - Authorised Credit or financial institution
 */
public class Tag481EnuMoneyLaunderingStatus extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum481MoneyLaunderingStatus dataValue;

    public final static Enum481MoneyLaunderingStatus TESTA_ENU_MONEY_LAUNDERING_STATUS
            = Enum481MoneyLaunderingStatus.EXEMPT_CLIENT_MONEY;
    public final static Enum481MoneyLaunderingStatus TESTB_ENU_MONEY_LAUNDERING_STATUS
            = Enum481MoneyLaunderingStatus.PASSED;

    public Tag481EnuMoneyLaunderingStatus(Enum481MoneyLaunderingStatus dataValue) {
        setFixType(FIX43.FIX481_ENU_MONEY_LAUNDERING_STATUS);
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
        Tag481EnuMoneyLaunderingStatus tagData;

        tagData = new Tag481EnuMoneyLaunderingStatus(TESTA_ENU_MONEY_LAUNDERING_STATUS);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag481EnuMoneyLaunderingStatus(TESTB_ENU_MONEY_LAUNDERING_STATUS);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum481MoneyLaunderingStatus oneEnum : Enum481MoneyLaunderingStatus.values()) {
            System.out.println( new Tag481EnuMoneyLaunderingStatus(oneEnum).toVerboseString() );
        }
    }
}
