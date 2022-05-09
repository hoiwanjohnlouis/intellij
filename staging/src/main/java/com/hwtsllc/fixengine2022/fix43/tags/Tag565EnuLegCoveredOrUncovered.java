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

package com.hwtsllc.fixengine2022.fix43.tags;

import com.hwtsllc.fixengine2022.datatypes.FIX43;
import com.hwtsllc.fixengine2022.datatypes.FIX43Abstract;
import com.hwtsllc.fixengine2022.datatypes.MyEnumCoveredOrUncovered;
import com.hwtsllc.fixengine2022.interfaces.FixTagValuePairString;
import com.hwtsllc.fixengine2022.interfaces.LogStringVerbose;

/**
 *  203 (same as 203, 565,)
 *  CoveredOrUncovered
 *  int
 *  <p>
 *  Used for derivative products, such as options
 *  <p></p>
 *  565
 *  LegCoveredOrUncovered
 *  int
 *  <p>
 *  CoveredOrUncovered for leg of a multileg
 *  <p>
 *  See CoveredOrUncovered (203) field for description
 *  <p></p>
 *  Valid values:
 *  <p>    0 - Covered
 *  <p>    1 - Uncovered
 */
public class Tag565EnuLegCoveredOrUncovered extends FIX43Abstract implements FixTagValuePairString, LogStringVerbose {
    private final MyEnumCoveredOrUncovered dataValue;

    public final static MyEnumCoveredOrUncovered TESTA_ENU_LEG_COVERED_OR_UNCOVERED
            = MyEnumCoveredOrUncovered.COVERED;
    public final static MyEnumCoveredOrUncovered TESTB_ENU_LEG_COVERED_OR_UNCOVERED
            = MyEnumCoveredOrUncovered.UNCOVERED;

    public Tag565EnuLegCoveredOrUncovered(MyEnumCoveredOrUncovered dataValue) {
        setFixType(FIX43.FIX565_ENU_LEG_COVERED_OR_UNCOVERED);
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
        Tag565EnuLegCoveredOrUncovered tagData;

        tagData = new Tag565EnuLegCoveredOrUncovered(TESTA_ENU_LEG_COVERED_OR_UNCOVERED);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());

        tagData = new Tag565EnuLegCoveredOrUncovered(TESTB_ENU_LEG_COVERED_OR_UNCOVERED);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
