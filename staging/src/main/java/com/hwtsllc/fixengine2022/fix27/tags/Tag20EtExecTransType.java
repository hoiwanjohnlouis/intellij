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
import com.hwtsllc.fixengine2022.fix27.enums.Enum20ExecTransType;

@Deprecated
public class Tag20EtExecTransType extends TagTypeAbstract {
    private final Enum20ExecTransType dataValue;

    public final static Enum20ExecTransType TESTA_ET_EXEC_TRANS_TYPE = Enum20ExecTransType.NEW; // fake data
    public final static Enum20ExecTransType TESTB_ET_EXEC_TRANS_TYPE = Enum20ExecTransType.STATUS;

    public Tag20EtExecTransType(Enum20ExecTransType dataValue) {
        setFixType(FIXType.FIX20_ET_EXEC_TRANS_TYPE);
        setDataValue(dataValue.getID());
        this.dataValue = dataValue;
    }

    /**
     *
     * @param args      Not used.
     */
    public static void main(String[] args) {
        Tag20EtExecTransType tagData = new Tag20EtExecTransType(TESTA_ET_EXEC_TRANS_TYPE);
        System.out.println(tagData);
        System.out.println(tagData.toLogStringVerbose());
        System.out.println(tagData.toFixTagValuePairString());
    }
}
