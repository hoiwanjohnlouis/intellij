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
import com.hwtsllc.fixengine2022.fix42.enums.Enum291FinancialStatus;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  291
 *  FinancialStatus
 *  MultipleCharValue
 *  <p>
 *  Identifies a firm's or a security's financial status
 *  <p></p>
 *  Valid values:
 *  <p>    1-3 msg types
 *  <p>    BANKRUPT( "1", "BANKRUPT", "1 - Bankrupt" ),
 *  <p>    PENDING_DELISTING( "2", "PENDING_DELISTING", "2 - Pending delisting" ),
 *  <p>    RESTRICTED( "3", "RESTRICTED", "3 - Restricted" ),
 */
public class Tag291EnuFinancialStatus extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum291FinancialStatus dataValue;

    public final static Enum291FinancialStatus TESTA_ENU_FINANCIAL_STATUS
            = Enum291FinancialStatus.BANKRUPT;
    public final static Enum291FinancialStatus TESTB_ENU_FINANCIAL_STATUS
            = Enum291FinancialStatus.PENDING_DELISTING;

    public Tag291EnuFinancialStatus(Enum291FinancialStatus dataValue) {
        setFixType(FIX42.FIX291_ENU_FINANCIAL_STATUS);
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
        Tag291EnuFinancialStatus tagData;

        tagData = new Tag291EnuFinancialStatus(TESTA_ENU_FINANCIAL_STATUS);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag291EnuFinancialStatus(TESTB_ENU_FINANCIAL_STATUS);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Enum291FinancialStatus oneEnum : Enum291FinancialStatus.values()) {
            System.out.println( new Tag291EnuFinancialStatus(oneEnum).toVerboseString() );
        }
    }
}
