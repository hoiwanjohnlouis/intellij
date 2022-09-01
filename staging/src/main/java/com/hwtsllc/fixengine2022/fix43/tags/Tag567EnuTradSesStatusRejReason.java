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
import com.hwtsllc.fixengine2022.fix43.enums.Enum567TradSesStatusRejReason;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  567
 *  TradSesStatusRejReason
 *  int
 *  <p></p>
 *  Indicates the reason a Trading Session Status Request was rejected.
 *  <p></p>
 *  Valid values:
 *  <p>    1 - Unknown or invalid TradingSessionID
 *  <p>    99 - Other
 *  <p>    or any value conforming to the data type Reserved100Plus
 */
public class Tag567EnuTradSesStatusRejReason extends FIX43Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum567TradSesStatusRejReason dataValue;

    public final static Enum567TradSesStatusRejReason TESTA_ENU_TRAD_SES_STATUS_REJ_REASON
            = Enum567TradSesStatusRejReason.OTHER;
    public final static Enum567TradSesStatusRejReason TESTB_ENU_TRAD_SES_STATUS_REJ_REASON
            = Enum567TradSesStatusRejReason.UNKNOWN_TRADING_SESSION_ID;

    public Tag567EnuTradSesStatusRejReason(Enum567TradSesStatusRejReason dataValue) {
        setFixType(FIX43.FIX567_ENU_TRAD_SES_STATUS_REJ_REASON);
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
        return dataValue.toEnumDescriptionString();
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
        Tag567EnuTradSesStatusRejReason tagData;

        tagData = new Tag567EnuTradSesStatusRejReason(TESTA_ENU_TRAD_SES_STATUS_REJ_REASON);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag567EnuTradSesStatusRejReason(TESTB_ENU_TRAD_SES_STATUS_REJ_REASON);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum567TradSesStatusRejReason oneEnum : Enum567TradSesStatusRejReason.values()) {
            System.out.println( new Tag567EnuTradSesStatusRejReason(oneEnum).toVerboseString() );
        }
    }
}
