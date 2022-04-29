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
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  Tag442
 *  Enu
 *  MultiLegReportingType
 *
 *      1-3 msg types
 *      SINGLE_SECURITY( "1", "SINGLE_SECURITY", "1 - Single security (default if not specified)" ),
 *      INDIVIDUAL_LEG_SECURITY( "2", "INDIVIDUAL_LEG_SECURITY", "2 - Individual leg of a multi=leg security" ),
 *      MULTI_LEG_SECURITY( "3", "MULTI_LEG_SECURITY", "3 - Multi-leg security" ),
 */
public class Tag442EnuMultiLegReportingType extends FIX42Abstract implements FixTagValuePairString, LogStringVerbose {
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
        Tag442EnuMultiLegReportingType tagData;

        tagData = new Tag442EnuMultiLegReportingType(TESTA_ENU_MULTI_LEG_REPORTING_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag442EnuMultiLegReportingType(TESTB_ENU_MULTI_LEG_REPORTING_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
