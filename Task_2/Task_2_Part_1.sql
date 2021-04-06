Select Country.Name
from Country join City
on Country.CountryID = City.CountryID
group by Country.Name
having SUM(Population) > 400
