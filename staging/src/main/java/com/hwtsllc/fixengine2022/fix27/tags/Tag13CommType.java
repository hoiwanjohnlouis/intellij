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

import com.hwtsllc.fixengine2022.datatypes.FIXType;
import com.hwtsllc.fixengine2022.datatypes.TagTypeAbstract;
import com.hwtsllc.fixengine2022.fix27.enums.Enum13CommType;

public class Tag13CommType extends TagTypeAbstract {
    private Enum13CommType dataValue;

    public final static Enum13CommType TESTA_COMMISSION = Enum13CommType.PER_UNIT; // fake data
    public final static Enum13CommType TESTB_COMMISSION = Enum13CommType.POINTS_PER_BOND;

    public Tag13CommType(Enum13CommType dataValue) {
        setFixType(FIXType.FIX13_COMM_TYPE);
        setDataValue(dataValue.getID());
        this.dataValue = dataValue;
    }

    /**
     *
     * @param args      Not used.
     */
    public static void main(String[] args) {
        Tag13CommType tag13CommType1 = new Tag13CommType(Enum13CommType.PER_UNIT);
        Tag13CommType tag13CommType2 = new Tag13CommType(Enum13CommType.PERCENT);
        Tag13CommType tag13CommType3 = new Tag13CommType(Enum13CommType.ABSOLUTE);
        Tag13CommType tag13CommType4 = new Tag13CommType(Enum13CommType.PERCENTAGE_WAIVED_CASH_DISCOUNT);
        Tag13CommType tag13CommType5 = new Tag13CommType(Enum13CommType.PERCENTAGE_WAIVED_ENHANCED_UNITS);
        Tag13CommType tag13CommType6 = new Tag13CommType(Enum13CommType.POINTS_PER_BOND);
        System.out.println(tag13CommType1);
        System.out.println(tag13CommType1.toLogStringVerbose());
        System.out.println(tag13CommType1.toFixTagValuePairString());
        System.out.println(tag13CommType2);
        System.out.println(tag13CommType2.toLogStringVerbose());
        System.out.println(tag13CommType2.toFixTagValuePairString());
        System.out.println(tag13CommType3);
        System.out.println(tag13CommType3.toLogStringVerbose());
        System.out.println(tag13CommType3.toFixTagValuePairString());
        System.out.println(tag13CommType4);
        System.out.println(tag13CommType4.toLogStringVerbose());
        System.out.println(tag13CommType4.toFixTagValuePairString());
        System.out.println(tag13CommType5);
        System.out.println(tag13CommType5.toLogStringVerbose());
        System.out.println(tag13CommType5.toFixTagValuePairString());
        System.out.println(tag13CommType6);
        System.out.println(tag13CommType6.toLogStringVerbose());
        System.out.println(tag13CommType6.toFixTagValuePairString());
    }
}
