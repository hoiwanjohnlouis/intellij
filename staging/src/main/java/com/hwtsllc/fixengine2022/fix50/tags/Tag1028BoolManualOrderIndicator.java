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
import com.hwtsllc.fixengine2022.fix50.enums.Bool1028ManualOrderIndicator;
import com.hwtsllc.fixengine2022.interfaces.BooleanString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  1028
 *  ManualOrderIndicator
 *  Boolean
 *  <p>
 *  Indicates if the order was initially received manually (as opposed to electronically)
 *  <p></p>
 *  <p> YES( "Y", "YES", "Y - Manually Order" ),
 *  <p> NO( "N", "NO", "N - Electronic Order" ),
 */
public class Tag1028BoolManualOrderIndicator extends FIX50Abstract implements LogValuePairString, LogVerboseString, BooleanString {
    private final Bool1028ManualOrderIndicator dataValue;

    public final static Bool1028ManualOrderIndicator TESTA_BOOL_MANUAL_ORDER_INDICATOR
            = Bool1028ManualOrderIndicator.NO ;
    public final static Bool1028ManualOrderIndicator TESTB_BOOL_MANUAL_ORDER_INDICATOR
            = Bool1028ManualOrderIndicator.YES;

    public Tag1028BoolManualOrderIndicator(Bool1028ManualOrderIndicator dataValue) {
        setFixType(FIX50.FIX1028_BOOL_MANUAL_ORDER_INDICATOR);
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
     * wrapper to format a simple Yes string describing the data
     */
    @Override
    public String toYesString() {
        return null;
    }
    /**
     * wrapper to format a simple No string describing the data
     */
    @Override
    public String toNoString() {
        return null;
    }
    /**
     * standard wrapper to format a simple string describing the data
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
        Tag1028BoolManualOrderIndicator tagData;

        tagData = new Tag1028BoolManualOrderIndicator(TESTA_BOOL_MANUAL_ORDER_INDICATOR);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag1028BoolManualOrderIndicator(TESTB_BOOL_MANUAL_ORDER_INDICATOR);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
