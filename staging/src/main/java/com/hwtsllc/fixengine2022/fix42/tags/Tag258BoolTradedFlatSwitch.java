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
import com.hwtsllc.fixengine2022.fix42.enums.Bool258TradedFlatSwitch;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

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
public class Tag258BoolTradedFlatSwitch extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Bool258TradedFlatSwitch dataValue;

    public final static Bool258TradedFlatSwitch TESTA_BOOL_TRADED_FLAT_SWITCH
            = Bool258TradedFlatSwitch.NO ;
    public final static Bool258TradedFlatSwitch TESTB_BOOL_TRADED_FLAT_SWITCH
            = Bool258TradedFlatSwitch.YES;

    public Tag258BoolTradedFlatSwitch(Bool258TradedFlatSwitch dataValue) {
        setFixType(FIX42.FIX258_BOOL_TRADED_FLAT_SWITCH);
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
                .concat("]");
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
        Tag258BoolTradedFlatSwitch tagData;

        tagData = new Tag258BoolTradedFlatSwitch(TESTA_BOOL_TRADED_FLAT_SWITCH);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag258BoolTradedFlatSwitch(TESTB_BOOL_TRADED_FLAT_SWITCH);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Bool258TradedFlatSwitch oneEnum : Bool258TradedFlatSwitch.values()) {
            System.out.println( new Tag258BoolTradedFlatSwitch(oneEnum).toVerboseString() );
        }
    }
}
