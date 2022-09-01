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
import com.hwtsllc.fixengine2022.fix42.enums.Enum338TradSesMethod;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  338
 *  Enu
 *  TradSesMethod
 *  int
 *  <p>
 *  Method of trading
 *  <p></p>
 *  Valid values:
 *  <p>    1-3 msg types
 *  <p>    "1 - Electronic"
 *  <p>    "2 - Open Outcry"
 *  <p>    "3 - Two Party"
 */
public class Tag338EnuTradSesMethod extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum338TradSesMethod dataValue;

    public final static Enum338TradSesMethod TESTA_ENU_TRAD_SES_METHOD
            = Enum338TradSesMethod.ELECTRONIC;
    public final static Enum338TradSesMethod TESTB_ENU_TRAD_SES_METHOD
            = Enum338TradSesMethod.OPEN_OUTCRY;

    public Tag338EnuTradSesMethod(Enum338TradSesMethod dataValue) {
        setFixType(FIX42.FIX338_ENU_TRAD_SES_METHOD);
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
        Tag338EnuTradSesMethod tagData;

        tagData = new Tag338EnuTradSesMethod(TESTA_ENU_TRAD_SES_METHOD);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag338EnuTradSesMethod(TESTB_ENU_TRAD_SES_METHOD);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Enum338TradSesMethod oneEnum : Enum338TradSesMethod.values()) {
            System.out.println( new Tag338EnuTradSesMethod(oneEnum).toVerboseString() );
        }
    }
}
