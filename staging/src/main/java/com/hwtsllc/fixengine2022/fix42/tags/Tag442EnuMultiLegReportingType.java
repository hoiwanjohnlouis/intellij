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
import com.hwtsllc.fixengine2022.fix42.enums.Enum442MultiLegReportingType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  442
 *  MultiLegReportingType
 *  char
 *  <p></p>
 *  Used to indicate what an Execution Report represents
 *  <p></p>
 *  (e.g. used with multi-leg securities, such as option strategies, spreads, etc.).
 *  <p></p>
 *  Valid values:
 *  <p>    1-3 msg types
 *  <p>    1 - Single security (default if not specified)
 *  <p>    2 - Individual leg of a multi=leg security
 *  <p>    3 - Multi-leg security
 */
public class Tag442EnuMultiLegReportingType extends FIX42Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum442MultiLegReportingType dataValue;

    public final static Enum442MultiLegReportingType TESTA_ENU_MULTI_LEG_REPORTING_TYPE
            = Enum442MultiLegReportingType.MULTI_LEG_SECURITY;
    public final static Enum442MultiLegReportingType TESTB_ENU_MULTI_LEG_REPORTING_TYPE
            = Enum442MultiLegReportingType.INDIVIDUAL_LEG_SECURITY;

    public Tag442EnuMultiLegReportingType(Enum442MultiLegReportingType dataValue) {
        setFixType(FIX42.FIX442_ENU_MULTI_LEG_REPORTING_TYPE);
        this.dataValue = dataValue;
    }

    public String getDataValue() {
        return this.dataValue.toEnumIDString();
    }
    /**
     * standard wrapper to retrieve the build a standard fix message for this tag
     */
    @Override
    public String toValuePairString() {
        return toEnumIDString()
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
        return this.dataValue.toEnumIDString();
    }
    /**
     * wrapper to return the Name of the underlying Data
     */
    @Override
    public String toDataNameString() {
        return this.dataValue.toEnumNameString();
    }
    /**
     * wrapper to return the Description of the underlying Data
     */
    @Override
    public String toDataDescriptionString() {
        return this.dataValue.toEnumDescriptionString();
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
        Tag442EnuMultiLegReportingType tagData;

        tagData = new Tag442EnuMultiLegReportingType(TESTA_ENU_MULTI_LEG_REPORTING_TYPE);
        System.out.println(tagData.toVerboseString());

        tagData = new Tag442EnuMultiLegReportingType(TESTB_ENU_MULTI_LEG_REPORTING_TYPE);
        System.out.println(tagData.toVerboseString());

        // loop around the ENUM and display
        for (Enum442MultiLegReportingType oneEnum : Enum442MultiLegReportingType.values()) {
            System.out.println( new Tag442EnuMultiLegReportingType(oneEnum).toVerboseString() );
        }
    }
}
