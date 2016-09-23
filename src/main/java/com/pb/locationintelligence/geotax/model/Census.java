/*******************************************************************************
 * Copyright 2016 Pitney Bowes Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and limitations under the License.
 *******************************************************************************/

package com.pb.locationintelligence.geotax.model;

/**
 * Created by MU001UP on 8/14/2016.
 */
public class Census {

    protected Cbsa cbsa;

    protected String matchLevel;

    protected String matchCode;

    protected String tract;

    protected Mcd mcd;

    public Cbsa getCbsa ()
    {
        return cbsa;
    }

    public void setCbsa (Cbsa cbsa)
    {
        this.cbsa = cbsa;
    }

    public String getMatchLevel ()
    {
        return matchLevel;
    }

    public void setMatchLevel (String matchLevel)
    {
        this.matchLevel = matchLevel;
    }

    public String getMatchCode ()
    {
        return matchCode;
    }

    public void setMatchCode (String matchCode)
    {
        this.matchCode = matchCode;
    }

    public String getTract ()
    {
        return tract;
    }

    public void setTract (String tract)
    {
        this.tract = tract;
    }

    public Mcd getMcd ()
    {
        return mcd;
    }

    public void setMcd (Mcd mcd)
    {
        this.mcd = mcd;
    }
}
