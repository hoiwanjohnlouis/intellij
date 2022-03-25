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

public class Tag13EtCommType extends TagTypeAbstract {
    private Enum13CommType dataValue;

    public final static Enum13CommType TESTA_ET_COMMISSION = Enum13CommType.PER_UNIT; // fake data
    public final static Enum13CommType TESTB_ET_COMMISSION = Enum13CommType.POINTS_PER_BOND;

    public Tag13EtCommType(Enum13CommType dataValue) {
        setFixType(FIXType.FIX13_ET_COMM_TYPE);
        setDataValue(dataValue.getID());
        this.dataValue = dataValue;
    }

    /**
     *
     * @param args      Not used.
     */
    public static void main(String[] args) {
        Tag13EtCommType tag13EtCommType1 = new Tag13EtCommType(Enum13CommType.PER_UNIT);
        Tag13EtCommType tag13EtCommType2 = new Tag13EtCommType(Enum13CommType.PERCENT);
        Tag13EtCommType tag13EtCommType3 = new Tag13EtCommType(Enum13CommType.ABSOLUTE);
        Tag13EtCommType tag13EtCommType4 = new Tag13EtCommType(Enum13CommType.PERCENTAGE_WAIVED_CASH_DISCOUNT);
        Tag13EtCommType tag13EtCommType5 = new Tag13EtCommType(Enum13CommType.PERCENTAGE_WAIVED_ENHANCED_UNITS);
        Tag13EtCommType tag13EtCommType6 = new Tag13EtCommType(Enum13CommType.POINTS_PER_BOND);
        System.out.println(tag13EtCommType1);
        System.out.println(tag13EtCommType1.toLogStringVerbose());
        System.out.println(tag13EtCommType1.toFixTagValuePairString());
        System.out.println(tag13EtCommType2);
        System.out.println(tag13EtCommType2.toLogStringVerbose());
        System.out.println(tag13EtCommType2.toFixTagValuePairString());
        System.out.println(tag13EtCommType3);
        System.out.println(tag13EtCommType3.toLogStringVerbose());
        System.out.println(tag13EtCommType3.toFixTagValuePairString());
        System.out.println(tag13EtCommType4);
        System.out.println(tag13EtCommType4.toLogStringVerbose());
        System.out.println(tag13EtCommType4.toFixTagValuePairString());
        System.out.println(tag13EtCommType5);
        System.out.println(tag13EtCommType5.toLogStringVerbose());
        System.out.println(tag13EtCommType5.toFixTagValuePairString());
        System.out.println(tag13EtCommType6);
        System.out.println(tag13EtCommType6.toLogStringVerbose());
        System.out.println(tag13EtCommType6.toFixTagValuePairString());
    }
}
