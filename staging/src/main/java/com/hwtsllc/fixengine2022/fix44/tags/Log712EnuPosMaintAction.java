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
import com.hwtsllc.fixengine2022.fix44.enums.Enum712PosMaintAction;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  712
 *  PosMaintAction
 *  Maintenance Action to be performed.
 *  Valid values:
 *      1 - New - used to increment the overall transaction quantity
 *      2 - Replace - used to override the overall transaction quantity
 *                      or specifically add messages based on the reference ID
 *      3 - Cancel - used to remove the overall transaction or specific
 *                      add messages based on reference ID
 *      4 - Reverse - used to completely back-out the transaction
 *                      such that the transaction never existed
 */
public class Log712EnuPosMaintAction extends FIX44Abstract implements LogValuePairString, LogVerboseString {
    private final Enum712PosMaintAction dataValue;

    public final static Enum712PosMaintAction TESTA_ENU_POS_MAINT_ACTION
            = Enum712PosMaintAction.CANCEL;
    public final static Enum712PosMaintAction TESTB_ENU_POS_MAINT_ACTION
            = Enum712PosMaintAction.REVERSE;

    public Log712EnuPosMaintAction(Enum712PosMaintAction dataValue) {
        setFixType(FIX44.FIX712_ENU_POS_MAINT_ACTION);
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
        Log712EnuPosMaintAction tagData;

        tagData = new Log712EnuPosMaintAction(TESTA_ENU_POS_MAINT_ACTION);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Log712EnuPosMaintAction(TESTB_ENU_POS_MAINT_ACTION);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
