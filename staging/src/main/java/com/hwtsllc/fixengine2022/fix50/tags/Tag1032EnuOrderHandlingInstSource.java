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

import com.hwtsllc.fixengine2022.datatypes.MyEnumOrderSource;
import com.hwtsllc.fixengine2022.datatypes.FIX50;
import com.hwtsllc.fixengine2022.datatypes.FIX50Abstract;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  1032 (same as 1032, 1034,)
 *  OrderHandlingInstSource
 *  int
 *  <p>
 *  Identifies the class or source of the “OrderHandlingInst” values.
 *  <p>
 *  Scope of this will apply to both CustOrderHandlingInst and DeskOrderHandlingInst fields.
 *  <p>
 *  Required if CustOrderHandlingInst and/or DeskOrderHandlingInst is specified.
 *  <p></p>
 *  1034
 *  DeskTypeSource
 *  int
 *  <p></p>
 *  Valid values:
 *  <p>    1 - NASD OATS
 */
public class Tag1032EnuOrderHandlingInstSource extends FIX50Abstract implements FixTagValuePairString, LogStringVerbose {
    private final MyEnumOrderSource dataValue;

    public final static MyEnumOrderSource TESTA_ENU_ORDER_HANDLING_INST_SOURCE
            = MyEnumOrderSource.NASD_OATS;
    public final static MyEnumOrderSource TESTB_ENU_ORDER_HANDLING_INST_SOURCE
            = MyEnumOrderSource.NASD_OATS;

    public Tag1032EnuOrderHandlingInstSource(MyEnumOrderSource dataValue) {
        setFixType(FIX50.FIX1032_ENU_ORDER_HANDLING_INST_SOURCE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.getID();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toFixTagValuePairString() {
        return getID()
                .concat("=")
                .concat(getDataValue());
    }
    /**
     * standard wrapper to format a detailed string describing this data field
     */
    @Override
    public String toLogStringVerbose() {
        return super.toLogStringVerbose()
                .concat("\n\tDataValue[")
                .concat(toString())
                .concat("]");
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
        Tag1032EnuOrderHandlingInstSource tagData;

        tagData = new Tag1032EnuOrderHandlingInstSource(TESTA_ENU_ORDER_HANDLING_INST_SOURCE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag1032EnuOrderHandlingInstSource(TESTB_ENU_ORDER_HANDLING_INST_SOURCE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
