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
import com.hwtsllc.fixengine2022.fix50.enums.Enum1033DeskType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  1033
 *  DeskType
 *  String
 *  <p>
 *  Type of trading desk
 *  <p></p>
 *  Valid values:
 *  <p>    A - Agency
 *  <p>    AR - Arbitrage
 *  <p>    D - Derivatives
 *  <p>    IN - International
 *  <p>    IS - Institutional
 *  <p></p>
 *  <p>    O - Other
 *  <p>    PF - Preferred Trading
 *  <p>    PR - Proprietary
 *  <p>    PT - Program Trading
 *  <p>    S - Sales
 *  <p></p>
 *  <p>    T - Trading
 */
public class Tag1033EnuDeskType extends FIX50Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum1033DeskType dataValue;

    public final static Enum1033DeskType TESTA_ENU_DESK_TYPE
            = Enum1033DeskType.AGENCY;
    public final static Enum1033DeskType TESTB_ENU_DESK_TYPE
            = Enum1033DeskType.PREFERRED;

    public Tag1033EnuDeskType(Enum1033DeskType dataValue) {
        setFixType(FIX50.FIX1033_ENU_DESK_TYPE);
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
        Tag1033EnuDeskType tagData;

        tagData = new Tag1033EnuDeskType(TESTA_ENU_DESK_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println("Accessing FIXType Directly");
        System.out.println("EnumName:" + tagData.toEnumNameString());
        System.out.println("ID:" + tagData.toFIXIDString());
        System.out.println("Name:" + tagData.toFIXNameString());
        System.out.println("Description:" + tagData.toFIXDescriptionString());
        System.out.println("DataIDString:" + tagData.toDataIDString());
        System.out.println("DataNameString:" + tagData.toDataNameString());
        System.out.println("DataDescriptionString:" + tagData.toDataDescriptionString());

        tagData = new Tag1033EnuDeskType(TESTB_ENU_DESK_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
        System.out.println("Accessing FIXType Directly");
        System.out.println("EnumName:" + tagData.toEnumNameString());
        System.out.println("ID:" + tagData.toFIXIDString());
        System.out.println("Name:" + tagData.toFIXNameString());
        System.out.println("Description:" + tagData.toFIXDescriptionString());
        System.out.println("DataIDString:" + tagData.toDataIDString());
        System.out.println("DataNameString:" + tagData.toDataNameString());
        System.out.println("DataDescriptionString:" + tagData.toDataDescriptionString());
    }
}
