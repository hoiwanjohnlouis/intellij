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
import com.hwtsllc.fix.enums.fix42.Enum258TradedFlatSwitch;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  258
 *  TradedFlatSwitch
 *  Boolean
 *  <p>
 *  Driver and part of trade in the event that the Security Master file was wrong at the point of entry
 *  <p>
 *  (Note tag # was reserved in FIX 4.1, added in FIX 4.3)
 *  <p></p>
 *  Valid values:
 *  <p>    N - Not Traded Flat
 *  <p>    Y - Traded Flat
 */
public class Tag258EnuTradedFlatSwitch extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum258TradedFlatSwitch dataValue;

    public final static Enum258TradedFlatSwitch TESTA_ENU_TRADED_FLAT_SWITCH
            = Enum258TradedFlatSwitch.NO ;
    public final static Enum258TradedFlatSwitch TESTB_ENU_TRADED_FLAT_SWITCH
            = Enum258TradedFlatSwitch.YES;

    public Tag258EnuTradedFlatSwitch(Enum258TradedFlatSwitch dataValue) {
        setFixType(FIX42.FIX258_ENU_TRADED_FLAT_SWITCH);
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
        Tag258EnuTradedFlatSwitch tagData;

        tagData = new Tag258EnuTradedFlatSwitch(TESTA_ENU_TRADED_FLAT_SWITCH);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag258EnuTradedFlatSwitch(TESTB_ENU_TRADED_FLAT_SWITCH);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Enum258TradedFlatSwitch oneEnum : Enum258TradedFlatSwitch.values()) {
            System.out.println( new Tag258EnuTradedFlatSwitch(oneEnum).toVerboseString() );
        }
    }
}
