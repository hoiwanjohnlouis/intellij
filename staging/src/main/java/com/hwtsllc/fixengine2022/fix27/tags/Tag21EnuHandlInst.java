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

package com.hwtsllc.fixengine2022.fix27.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX27;
import com.hwtsllc.fixengine2022.datatypes.FIX27Abstract;
import com.hwtsllc.fixengine2022.fix27.enums.Enum21HandlInst;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  21
 *  HandlInst
 *  char
 *  Instructions for order handling on Broker trading floor
 *  Valid values:
 *      1 - Automated execution order, private, no Broker intervention
 *      2 - Automated execution order, public, Broker intervention OK
 *      3 - Manual order, best execution
 */
public class Tag21EnuHandlInst extends FIX27Abstract implements FixTagValuePairString, LogStringVerbose {
    private final Enum21HandlInst dataValue;

    public final static Enum21HandlInst TESTA_ENU_HANDL_INST = Enum21HandlInst.AUTOMATIC_EXECUTION_NO_BROKER; // fake data
    public final static Enum21HandlInst TESTB_ENU_HANDL_INST = Enum21HandlInst.AUTOMATIC_EXECUTION_BROKER_OKAY;

    public Tag21EnuHandlInst(Enum21HandlInst dataValue) {
        setFixType(FIX27.FIX21_ENU_HANDL_INST);
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
        Tag21EnuHandlInst tagData;

        tagData = new Tag21EnuHandlInst(TESTA_ENU_HANDL_INST);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag21EnuHandlInst(TESTB_ENU_HANDL_INST);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
