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

package com.hwtsllc.fix.tags.fix44;

import com.hwtsllc.fix.datatypes.FIX44;
import com.hwtsllc.fix.datatypes.FIX44Abstract;
import com.hwtsllc.fix.enums.fix44.Enum770TrdRegTimestampType;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  770
 *  TrdRegTimestampType
 *  int
 *  <p></p>
 *  Traded / Regulatory timestamp type.
 *  <p></p>
 *  Note of Applicability:
 *  <p>    Values are required in US futures markets by the CFTC to
 *         support computerized trade reconstruction.
 *  <p></p>
 *      (see Volume : "Glossary" for value definitions)
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Execution Time
 *  <p>    2 - Time In
 *  <p>    3 - Time Out
 *  <p>    4 - Broker Receipt
 *  <p>    5 - Broker Execution
 *  <p></p>
 *  <p>    6 - Desk Receipt
 */
public class Tag770EnuTrdRegTimestampType extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum770TrdRegTimestampType dataValue;

    public final static Enum770TrdRegTimestampType TESTA_ENU_TRD_REG_TIMESTAMP_TYPE
            = Enum770TrdRegTimestampType.TIME_IN;
    public final static Enum770TrdRegTimestampType TESTB_ENU_TRD_REG_TIMESTAMP_TYPE
            = Enum770TrdRegTimestampType.BROKER_RECEIPT;

    public Tag770EnuTrdRegTimestampType(Enum770TrdRegTimestampType dataValue) {
        setFixType(FIX44.FIX770_ENU_TRD_REG_TIMESTAMP_TYPE);
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
        Tag770EnuTrdRegTimestampType tagData;

        tagData = new Tag770EnuTrdRegTimestampType(TESTA_ENU_TRD_REG_TIMESTAMP_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag770EnuTrdRegTimestampType(TESTB_ENU_TRD_REG_TIMESTAMP_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum770TrdRegTimestampType oneEnum : Enum770TrdRegTimestampType.values()) {
            System.out.println( new Tag770EnuTrdRegTimestampType(oneEnum).toVerboseString() );
        }
    }
}
