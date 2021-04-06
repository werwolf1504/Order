select Country.Name
from Country join City
	on Country.CountryID = City.CountryID
	left join Building
	on	City.CityID = Building.CityID
group by Country.Name
having Count(BuildingID) < 1
