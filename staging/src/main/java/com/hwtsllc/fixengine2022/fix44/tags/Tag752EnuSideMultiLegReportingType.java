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
import com.hwtsllc.fixengine2022.fix44.enums.Enum752SideMultiLegReportingType;
import com.hwtsllc.fixengine2022.interfaces.LogDataString;
import com.hwtsllc.fixengine2022.interfaces.LogValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogVerboseString;

/**
 *  752
 *  SideMultiLegReportingType
 *  Used to indicate if the side being reported on Trade Capture Report
 *  represents a leg of a multileg instrument or a single security.
 *  Valid values:
 *      1 - Single Security (default if not specified)
 *      2 - Individual leg of a multileg security
 *      3 - Multileg Security
 */
public class Tag752EnuSideMultiLegReportingType extends FIX44Abstract implements LogValuePairString, LogVerboseString, LogDataString {
    private final Enum752SideMultiLegReportingType dataValue;

    public final static Enum752SideMultiLegReportingType TESTA_ENU_SIDE_MULTI_LEG_REPORTING_TYPE
            = Enum752SideMultiLegReportingType.SINGLE_SECURITY;
    public final static Enum752SideMultiLegReportingType TESTB_ENU_SIDE_MULTI_LEG_REPORTING_TYPE
            = Enum752SideMultiLegReportingType.MULTILEG_SECURITY;

    public Tag752EnuSideMultiLegReportingType(Enum752SideMultiLegReportingType dataValue) {
        setFixType(FIX44.FIX752_ENU_SIDE_MULTI_LEG_REPORTING_TYPE);
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
        Tag752EnuSideMultiLegReportingType tagData;

        tagData = new Tag752EnuSideMultiLegReportingType(TESTA_ENU_SIDE_MULTI_LEG_REPORTING_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());

        tagData = new Tag752EnuSideMultiLegReportingType(TESTB_ENU_SIDE_MULTI_LEG_REPORTING_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toVerboseString());
        System.out.println(tagData.toValuePairString());
    }
}
