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

package com.hwtsllc.fixengine2022.fix44.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX44;
import com.hwtsllc.fixengine2022.datatypes.FIX44Abstract;
import com.hwtsllc.fixengine2022.fix44.enums.Enum716SettlSessID;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  716
 *  SettlSessID
 *  String
 *  <p></p>
 *  Identifies a specific settlement session
 *  <p></p>
 *  Valid values:
 *  <p>    ITD - Intraday
 *  <p>    RTH - Regular Trading Hours
 *  <p>    ETH - Electronic Trading Hours
 *  <p>    EOD - End Of Day
 */
public class Tag716EnuSettlSessID extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum716SettlSessID dataValue;

    public final static Enum716SettlSessID TESTA_ENU_SETTL_SESS_ID
            = Enum716SettlSessID.INTRADAY;
    public final static Enum716SettlSessID TESTB_ENU_SETTL_SESS_ID
            = Enum716SettlSessID.END_OF_DAY;

    public Tag716EnuSettlSessID(Enum716SettlSessID dataValue) {
        setFixType(FIX44.FIX716_ENU_SETTL_SESS_ID);
        this.dataValue = dataValue;
    }

    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toEnumIDString()
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
        return dataValue.toEnumIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return dataValue.toEnumNameString();
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
        Tag716EnuSettlSessID tagData;

        tagData = new Tag716EnuSettlSessID(TESTA_ENU_SETTL_SESS_ID);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag716EnuSettlSessID(TESTB_ENU_SETTL_SESS_ID);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and process
        for ( Enum716SettlSessID oneEnum : Enum716SettlSessID.values()) {
            System.out.println( new Tag716EnuSettlSessID(oneEnum).toVerboseString() );
        }
    }
}
