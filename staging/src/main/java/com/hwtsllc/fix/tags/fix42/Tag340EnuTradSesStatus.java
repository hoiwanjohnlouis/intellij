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

package com.hwtsllc.fix.tags.fix42;

import com.hwtsllc.fix.datatypes.FIX42;
import com.hwtsllc.fix.datatypes.FIX42Abstract;
import com.hwtsllc.fix.enums.fix42.Enum340TradSesStatus;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  340
 *  Enu
 *  TradSesStatus
 *  int
 *  <p>
 *  State of the trading session.
 *  <p></p>
 *  Valid values:
 *  <p>    0-6 msg types
 *  <p>    "0 - Unknown"
 *  <p>    "1 - Halted"
 *  <p>    "2 - Open"
 *  <p>    "3 - Closed"
 *  <p>    "4 - Pre-Open"
 *  <p></p>
 *  <p>    "5 - Pre-Close"
 *  <p>    "6 - Request Rejected"
 */
public class Tag340EnuTradSesStatus extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum340TradSesStatus dataValue;

    public final static Enum340TradSesStatus TESTA_ENU_TRAD_SES_STATUS
            = Enum340TradSesStatus.REQUEST_REJECTED;
    public final static Enum340TradSesStatus TESTB_ENU_TRAD_SES_STATUS
            = Enum340TradSesStatus.PRE_OPEN;

    public Tag340EnuTradSesStatus(Enum340TradSesStatus dataValue) {
        setFixType(FIX42.FIX340_ENU_TRAD_SES_STATUS);
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
        Tag340EnuTradSesStatus tagData;

        tagData = new Tag340EnuTradSesStatus(TESTA_ENU_TRAD_SES_STATUS);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag340EnuTradSesStatus(TESTB_ENU_TRAD_SES_STATUS);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Enum340TradSesStatus oneEnum : Enum340TradSesStatus.values()) {
            System.out.println( new Tag340EnuTradSesStatus(oneEnum).toVerboseString() );
        }
    }
}
