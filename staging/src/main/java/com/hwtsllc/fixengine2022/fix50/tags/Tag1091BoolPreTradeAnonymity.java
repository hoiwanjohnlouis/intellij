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

package com.hwtsllc.fixengine2022.fix50.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.FIX50Abstract;
import com.hwtsllc.fixengine2022.fix50.enums.Bool1091PreTradeAnonymity;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  1091
 *  PreTradeAnonymity
 *  Boolean
 *  <p>
 *  Allows trader to explicitly request anonymity or disclosure in pre-trade market data feeds.
 *  <p>
 *  Anonymity is relevant in markets where counterparties are regularly disclosed in order depth feeds.
 *  <p>
 *  Disclosure is relevant when counterparties are not normally visible.
 *  <p></p>
 *  <p> YES( "Y", "YES", "Y - Trader explicitly request anonymity" ),
 *  <p> NO( "N", "NO", "N - Anonymity not required" ),
 */
public class Tag1091BoolPreTradeAnonymity extends FIX50Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Bool1091PreTradeAnonymity dataValue;

    public final static Bool1091PreTradeAnonymity TESTA_BOOL_PRE_TRADE_ANONYMITY
            = Bool1091PreTradeAnonymity.NO ;
    public final static Bool1091PreTradeAnonymity TESTB_BOOL_PRE_TRADE_ANONYMITY
            = Bool1091PreTradeAnonymity.YES;

    public Tag1091BoolPreTradeAnonymity(Bool1091PreTradeAnonymity dataValue) {
        setFixType(FIX50.FIX1091_BOOL_PRE_TRADE_ANONYMITY);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return getID()
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
        return this.dataValue.getID();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.getName();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.getDescription();
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
        Tag1091BoolPreTradeAnonymity tagData;

        tagData = new Tag1091BoolPreTradeAnonymity(TESTA_BOOL_PRE_TRADE_ANONYMITY);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println("Accessing FIXType Directly");
        System.out.println("EnumName:" + tagData.getEnumName());
        System.out.println("ID:" + tagData.getID());
        System.out.println("Name:" + tagData.getName());
        System.out.println("Description:" + tagData.getDescription());
        System.out.println("DataIDString:" + tagData.toDataIDString());
        System.out.println("DataNameString:" + tagData.toDataNameString());
        System.out.println("DataDescriptionString:" + tagData.toDataDescriptionString());

        tagData = new Tag1091BoolPreTradeAnonymity(TESTB_BOOL_PRE_TRADE_ANONYMITY);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println("Accessing FIXType Directly");
        System.out.println("EnumName:" + tagData.getEnumName());
        System.out.println("ID:" + tagData.getID());
        System.out.println("Name:" + tagData.getName());
        System.out.println("Description:" + tagData.getDescription());
        System.out.println("DataIDString:" + tagData.toDataIDString());
        System.out.println("DataNameString:" + tagData.toDataNameString());
        System.out.println("DataDescriptionString:" + tagData.toDataDescriptionString());
    }
}
