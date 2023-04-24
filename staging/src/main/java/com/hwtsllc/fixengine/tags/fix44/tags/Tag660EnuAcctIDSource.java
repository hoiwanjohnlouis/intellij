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

package com.hwtsllc.fixengine.tags.fix44.tags;

import com.hwtsllc.fixengine.datatypes.FIX44;
import com.hwtsllc.fixengine.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine.datatypes.MyEnumAcctIDSource;
import com.hwtsllc.fixengine.interfaces.LogDataString;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  660 (same as 660, 661)
 *  AcctIDSource
 *  int
 *  <p>
 *  Used to identify the source of the Account (1) code.
 *  This is especially useful if the account is a new account
 *  that the Respondent may not have set up yet in their system.
 *  <p></p>
 *  661 (same as 660, 601)
 *  AllocAcctIDSource
 *  int
 *  <p>
 *  Used to identify the source of the AllocAccount (79) code.
 *      See AcctIDSource (660) for valid values.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - BIC
 *  <p>    2 - SID Code
 *  <p>    3 - TFM (GSPTA)
 *  <p>    4 - OMGEO (Alert ID)
 *  <p>    5 - DTCC Code
 *  <p>    99 - Other (custom or proprietary)
 */
public class Tag660EnuAcctIDSource extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final MyEnumAcctIDSource dataValue;

    public final static MyEnumAcctIDSource TESTA_ENU_ACCT_ID_SOURCE
            = MyEnumAcctIDSource.BIC;
    public final static MyEnumAcctIDSource TESTB_ENU_ACCT_ID_SOURCE
            = MyEnumAcctIDSource.OMGEO;

    public Tag660EnuAcctIDSource(MyEnumAcctIDSource dataValue) {
        setFixType(FIX44.FIX660_ENU_ACCT_ID_SOURCE);
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
        Tag660EnuAcctIDSource tagData;

        tagData = new Tag660EnuAcctIDSource(TESTA_ENU_ACCT_ID_SOURCE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag660EnuAcctIDSource(TESTB_ENU_ACCT_ID_SOURCE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( MyEnumAcctIDSource oneEnum : MyEnumAcctIDSource.values()) {
            System.out.println( new Tag660EnuAcctIDSource(oneEnum).toVerboseString() );
        }
    }
}
