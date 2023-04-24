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

package com.hwtsllc.fixengine.tags.fix42;

import com.hwtsllc.fixengine.datatypes.FIX42;
import com.hwtsllc.fixengine.datatypes.FIX42Abstract;
import com.hwtsllc.fixengine.enums.fix42.Enum339TrdSesMode;
import com.hwtsllc.fixengine.interfaces.LogDataString;
import com.hwtsllc.fixengine.interfaces.LogValuePairString;
import com.hwtsllc.fixengine.interfaces.LogVerboseString;

/**
 *  339
 *  Enu
 *  TradSesMode
 *  int
 *  <p>
 *  Trading Session Mode
 *  <p></p>
 *  Valid values:
 *  <p>    1-3 msg types
 *  <p>    "1 - Testing"
 *  <p>    "2 - Simulated"
 *  <p>    "3 - Production"
 */
public class Tag339EnuTradSesMode extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum339TrdSesMode dataValue;

    public final static Enum339TrdSesMode TESTA_ENU_TRAD_SES_MODE
            = Enum339TrdSesMode.TESTING;
    public final static Enum339TrdSesMode TESTB_ENU_TRAD_SES_MODE
            = Enum339TrdSesMode.SIMULATED;

    public Tag339EnuTradSesMode(Enum339TrdSesMode dataValue) {
        setFixType(FIX42.FIX339_ENU_TRAD_SES_MODE);
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
        Tag339EnuTradSesMode tagData;

        tagData = new Tag339EnuTradSesMode(TESTA_ENU_TRAD_SES_MODE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag339EnuTradSesMode(TESTB_ENU_TRAD_SES_MODE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Enum339TrdSesMode oneEnum : Enum339TrdSesMode.values()) {
            System.out.println( new Tag339EnuTradSesMode(oneEnum).toVerboseString() );
        }
    }
}
