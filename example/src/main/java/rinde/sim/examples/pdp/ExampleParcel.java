/**
 * 
 */
package rinde.sim.examples.pdp;

import rinde.sim.core.graph.Point;
import rinde.sim.core.model.pdp.PDPModel;
import rinde.sim.core.model.pdp.Parcel;
import rinde.sim.core.model.road.RoadModel;
import rinde.sim.util.TimeWindow;

/**
 * @author Rinde van Lon <rinde.vanlon@cs.kuleuven.be>
 * 
 */
public class ExampleParcel extends Parcel {

	public ExampleParcel(Point startPosition, Point pDestination, int pLoadingDuration, int pUnloadingDuration,
			double magnitude) {
		super(pDestination, pLoadingDuration, TimeWindow.ALWAYS, pUnloadingDuration, TimeWindow.ALWAYS, magnitude);
		setStartPosition(startPosition);
	}

	@Override
	public void initRoadPDP(RoadModel pRoadModel, PDPModel pPdpModel) {}

}
