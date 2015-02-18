/**
 * Copyright (C) 2014 Martín Pacheco.
 *
 * This file is part of my Thesis aplication called "Extraction and Analysis
 * System of Topics for Software History Reports". Faculty of Exact Sciences of
 * the UNICEN University. Tandil, Argentine. http://www.exa.unicen.edu.ar/
 *
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 *
 * Email: mpacheco@alumnos.exa.unicen.edu.ar
 *
 * @author Martín Pacheco
 */
package charts.data;

import charts.Chart;
import dto.TopicDTO;
import java.util.ArrayList;
import java.util.Observable;
import metrics.Metric;

public abstract class DataChartGenerator extends Observable {

    Chart chart;

    DataChartGenerator(Chart chart) {
        this.chart = chart;
    }

    /**
     * Generates the data for a chart.
     *
     * @param topics List of topics for representation.
     * @param metric Metric to show.
     */
    public abstract void generateData(ArrayList<TopicDTO> topics, Metric metric);

    /**
     * Generates the data for a chart.
     */
    public abstract void generateData();
}
