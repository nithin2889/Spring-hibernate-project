package my.pack.dataAccessTier.domain.workers;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import my.pack.dataAccessTier.domain.subfacilities.Area;
import my.pack.dataAccessTier.domain.superclasses.Worker_;

@Generated("EclipseLink-2.0.2.v20100323-r6872 @ Wed Jul 24 15:26:23 IDT 2013")
@StaticMetamodel(Vet.class)
public class Vet_ extends Worker_ {

	public static volatile ListAttribute<Vet, Area> areas_of_responsibility;

}