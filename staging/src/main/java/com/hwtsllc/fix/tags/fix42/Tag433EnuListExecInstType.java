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
import com.hwtsllc.fix.enums.fix42.Enum433ListExecInstType;
import com.hwtsllc.fix.interfaces.LogDataString;
import com.hwtsllc.fix.interfaces.LogValuePairString;
import com.hwtsllc.fix.interfaces.LogVerboseString;

/**
 *  433
 *  ListExecInstType
 *  char
 *  <p>
 *  Identifies the type of ListExecInst (69).
 *  <p></p>
 *  Valid values:
 *  <p>    1-5 msg types
 *  <p>    1 - Immediate
 *  <p>    2 - Wait for Execute Instruction
 *  <p>        (i.e. a List Execute message or phone call before proceeding with execution of the list)
 *  <p>    3 - Exchange/switch CIV order - Sell driven
 *  <p>    4 - Exchange/switch CIV order - Buy driven, cash top-up
 *  <p>        (i.e. additional cash will be provided to fulfill the order)
 *  <p>    5 - Exchange/switch CIV order - Buy driven, cash withdraw
 *  <p>        (i.e. additional cash will not be provided to fulfill the order)
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
        Tag433EnuListExecInstType tagData;

        tagData = new Tag433EnuListExecInstType(TESTA_ENU_LIST_EXEC_INST_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag433EnuListExecInstType(TESTB_ENU_LIST_EXEC_INST_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Enum433ListExecInstType oneEnum : Enum433ListExecInstType.values()) {
            System.out.println( new Tag433EnuListExecInstType(oneEnum).toVerboseString() );
        }
    }
}
