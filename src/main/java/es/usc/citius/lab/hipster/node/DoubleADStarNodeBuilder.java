/*
 * Copyright 2013 Centro de Investigación en Tecnoloxías da Información (CITIUS).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package es.usc.citius.lab.hipster.node;

/**
 *
 * @author Adrián González Sieira <adrian.gonzalez@usc.es>
 * @since 02-04-2013
 * @version 1.0
 */
public class DoubleADStarNodeBuilder<S> implements NodeBuilder<S, ADStarNode<S>>{

    public ADStarNode<S> node(ADStarNode<S> from, Transition<S> transition) {
        if(from == null){
            return new ADStarNode<S>(transition, null, 0.0, Double.POSITIVE_INFINITY, new ADStarNode.Key(0, 0));
        }
        else{
         return new ADStarNode<S>(transition, null, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, new ADStarNode.Key(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY));   
        }
    }

}