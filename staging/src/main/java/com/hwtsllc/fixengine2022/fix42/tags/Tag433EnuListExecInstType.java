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
import com.hwtsllc.fixengine2022.fix42.enums.Enum433ListExecInstType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  Tag433
 *  Enu
 *  ListExecInstType
 *
 *      1-5 msg types
 *      IMMEDIATE( "1", "IMMEDIATE", "1 - Immediate" ),
 *      WAIT_FOR_EXECUTION_INSTRUCTION( "2", "WAIT_FOR_EXECUTION_INSTRUCTION",
 *                          "2 - Wait for Execution Instruction (i.e. a List Execution message or " +
 *                          "phone call before proceeding with execution of the list)" ),
 *      SELL_DRIVEN( "3", "SELL_DRIVEN", "3 - Exchange/switch CIV order - Sell driven" ),
 *      BUY_DRIVEN_CASH_TOP_UP( "4", "BUY_DRIVEN_CASH_TOP_UP",
 *                          "4 - Exchange/switch CIV order - Buy driven, cash top-up " +
 *                          "(i.e. additional cash will be provided to fulfill the order)" ),
 *      BUY_DRIVEN_CASH_WITHDRAW( "5", "BUY_DRIVEN_CASH_WITHDRAW",
 *                          "5 - Exchange/switch CIV order - Buy driven, cash withdraw " +
 *                          "(i.e. additional cash will not be provided to fulfill the order)" ),
 */
public class Tag433EnuListExecInstType extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum433ListExecInstType dataValue;

    public final static Enum433ListExecInstType TESTA_ENU_LIST_EXEC_INST_TYPE
            = Enum433ListExecInstType.WAIT_FOR_EXECUTION_INSTRUCTION;
    public final static Enum433ListExecInstType TESTB_ENU_LIST_EXEC_INST_TYPE
            = Enum433ListExecInstType.BUY_DRIVEN_CASH_WITHDRAW;

    public Tag433EnuListExecInstType(Enum433ListExecInstType dataValue) {
        setFixType(FIX42.FIX433_ENU_LIST_EXEC_INST_TYPE);
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
        Tag433EnuListExecInstType tagData;

        tagData = new Tag433EnuListExecInstType(TESTA_ENU_LIST_EXEC_INST_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toDataDescriptionString());

        tagData = new Tag433EnuListExecInstType(TESTB_ENU_LIST_EXEC_INST_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println(tagData.toDataDescriptionString());
    }
}
