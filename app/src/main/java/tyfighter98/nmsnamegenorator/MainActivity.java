package tyfighter98.nmsnamegenorator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    public final static String GENERATED_NAME = "tyfighter98.nmsnamegenorator.NAME";
    public String planetName;

    private String biomeSelectedInSpinner, resourceSelectedInSpinner, lifeFormSelectedInSpinner,
            lawSelectedInSpinner, structureSelectedInSpinner, climateSelectedInSpinner,
            directionSelectedInSpinner;

    private Spinner biomesSpinner, resourcesSpinner, lifeFormsSpinner, lawSpinner, structuresSpinner,
            climateSpinner, directionSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Populate spinners from resource files
        addItemsToBiomeSpinner();
        addItemsToResourceSpinner();
        addItemsToLifeFormSpinner();
        addItemsToLawSpinner();
        addItemsToStructureSpinner();
        addItemsToClimateSpinner();
        addItemsToDirectionSpinner();

        // Get selection from spinner to feed into name generation
        addListenerToBiomeSpinner();
        addListenerToResourceSpinner();
        addListenerToLifeFormSpinner();
        addListenerToLawSpinner();
        addListenerToStructureSpinner();
        addListenerToClimateSpinner();
        addListenerToDirectionSpinner();
    }

    //      <<---------Biomes--------->>
    public void addItemsToBiomeSpinner() {
        // Get a reference to the spinner
        biomesSpinner = (Spinner) findViewById(R.id.biomes_spinner);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> biomeSpinnerAdapter = ArrayAdapter.createFromResource(this,
                R.array.biomes, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        biomeSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        biomesSpinner.setAdapter(biomeSpinnerAdapter);
    }

    public void addListenerToBiomeSpinner() {
        biomesSpinner = (Spinner) findViewById(R.id.biomes_spinner);
        biomesSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View arg1, int pos, long arg3) {
                // Get the item selected in the Spinner
                biomeSelectedInSpinner = parent.getItemAtPosition(pos).toString();
            }
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO maybe add something here later
            }
        });
    }

    //      <<---------Resources--------->>
    public void addItemsToResourceSpinner() {
        // Get a reference to the spinner
        resourcesSpinner = (Spinner) findViewById(R.id.resources_spinner);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> biomeSpinnerAdapter = ArrayAdapter.createFromResource(this,
                R.array.resources, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        biomeSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        resourcesSpinner.setAdapter(biomeSpinnerAdapter);
    }

    public void addListenerToResourceSpinner() {
        resourcesSpinner = (Spinner) findViewById(R.id.resources_spinner);
        resourcesSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View arg1, int pos, long arg3) {
                // Get the item selected in the Spinner
                resourceSelectedInSpinner = parent.getItemAtPosition(pos).toString();
            }
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO maybe add something here later
            }
        });
    }

    //      <<---------Life Forms--------->>
    public void addItemsToLifeFormSpinner() {
        // Get a reference to the spinner
        lifeFormsSpinner = (Spinner) findViewById(R.id.life_forms_spinner);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> biomeSpinnerAdapter = ArrayAdapter.createFromResource(this,
                R.array.life_forms, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        biomeSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        lifeFormsSpinner.setAdapter(biomeSpinnerAdapter);
    }

    public void addListenerToLifeFormSpinner() {
        lifeFormsSpinner = (Spinner) findViewById(R.id.life_forms_spinner);
        lifeFormsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View arg1, int pos, long arg3) {
                // Get the item selected in the Spinner
                lifeFormSelectedInSpinner = parent.getItemAtPosition(pos).toString();
            }
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO maybe add something here later
            }
        });
    }

    //      <<---------Law--------->>
    public void addItemsToLawSpinner() {
        // Get a reference to the spinner
        lawSpinner = (Spinner) findViewById(R.id.law_spinner);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> biomeSpinnerAdapter = ArrayAdapter.createFromResource(this,
                R.array.law, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        biomeSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        lawSpinner.setAdapter(biomeSpinnerAdapter);
    }

    public void addListenerToLawSpinner() {
        lawSpinner = (Spinner) findViewById(R.id.law_spinner);
        lawSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View arg1, int pos, long arg3) {
                // Get the item selected in the Spinner
                lawSelectedInSpinner = parent.getItemAtPosition(pos).toString();
            }
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO maybe add something here later
            }
        });
    }

    //      <<---------Structures--------->>
    public void addItemsToStructureSpinner() {
        // Get a reference to the spinner
        structuresSpinner = (Spinner) findViewById(R.id.structures_spinner);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> biomeSpinnerAdapter = ArrayAdapter.createFromResource(this,
                R.array.structures, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        biomeSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        structuresSpinner.setAdapter(biomeSpinnerAdapter);
    }

    public void addListenerToStructureSpinner() {
        structuresSpinner = (Spinner) findViewById(R.id.structures_spinner);
        structuresSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View arg1, int pos, long arg3) {
                // Get the item selected in the Spinner
                structureSelectedInSpinner = parent.getItemAtPosition(pos).toString();
            }
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO maybe add something here later
            }
        });
    }

    //      <<---------Climates--------->>
    public void addItemsToClimateSpinner() {
        // Get a reference to the spinner
        climateSpinner = (Spinner) findViewById(R.id.climate_spinner);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> biomeSpinnerAdapter = ArrayAdapter.createFromResource(this,
                R.array.climates, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        biomeSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        climateSpinner.setAdapter(biomeSpinnerAdapter);
    }

    public void addListenerToClimateSpinner() {
        climateSpinner = (Spinner) findViewById(R.id.climate_spinner);
        climateSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View arg1, int pos, long arg3) {
                // Get the item selected in the Spinner
                climateSelectedInSpinner = parent.getItemAtPosition(pos).toString();
            }
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO maybe add something here later
            }
        });
    }

    //      <<---------Direction--------->>
    public void addItemsToDirectionSpinner() {
        // Get a reference to the spinner
        directionSpinner = (Spinner) findViewById(R.id.direction_spinner);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> biomeSpinnerAdapter = ArrayAdapter.createFromResource(this,
                R.array.direction, android.R.layout.simple_spinner_item);

        // Specify the layout to use when the list of choices appears
        biomeSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        directionSpinner.setAdapter(biomeSpinnerAdapter);
    }

    public void addListenerToDirectionSpinner() {
        directionSpinner = (Spinner) findViewById(R.id.direction_spinner);
        directionSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View arg1, int pos, long arg3) {
                // Get the item selected in the Spinner
                directionSelectedInSpinner = parent.getItemAtPosition(pos).toString();
            }
            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO maybe add something here later
            }
        });
    }

    public String combineNames() {

        //      <<---------Biomes--------->>
        String biome;
        switch (biomeSelectedInSpinner) {
            case "Desert":
                biome="De";
                break;
            case "Featureless":
                biome="Fe";
                break;
            case "Floating Islands":
                biome="Fi";
                break;
            case "Plains":
                biome="Ga";
                break;
            case "Lava":
                biome="La";
                break;
            case "Liquid":
                biome="Li";
                break;
            case "Mountains":
                biome="Mo";
                break;
            case "Pillars":
                biome="Pi";
                break;
            case "Rocky":
                biome="Ro";
                break;
            case "Snow":
                biome="Si";
                break;
            case "Weird Stuff":
                biome="We";
                break;
            default:
                biome="Invalid Biome";
                break;
        }

        //      <<---------Resources--------->>
        String resource;
        switch (resourceSelectedInSpinner) {
            case "Ship":
                resource="shp";
                break;
            case "Suit":
                resource="sut";
                break;
            case "Multi-Tool":
                resource="mul";
                break;
            case "Blueprint":
                resource="bup";
                break;
            case "Trading":
                resource="tar";
                break;
            case "Ship/Suit":
                resource="shs";
                break;
            case "Ship/Multi-Tool":
                resource="shm";
                break;
            case "Ship/Trading":
                resource="sht";
                break;
            case "Ship/Blueprint":
                resource="shb";
                break;
            case "Suit/Multi-Tool":
                resource="sum";
                break;
            case "Suit/Trading":
                resource="str";
                break;
            case "Suit/Blueprint":
                resource="sub";
                break;
            case "Multi-Tool/Trading":
                resource="mtr";
                break;
            case "Multi-Tool/Blueprint":
                resource="mbl";
                break;
            case "Blueprint/Trading":
                resource="btr";
                break;
            case "No Blueprint":
                resource="nth";
                break;
            default:
                resource="Invalid Resource";
        }

        //      <<---------Life Forms--------->>
        String lifeForm;
        switch (lifeFormSelectedInSpinner) {
            case "Multiple":
                lifeForm="a";
                break;
            case "Plants":
                lifeForm="e";
                break;
            case "Creatures":
                lifeForm="i";
                break;
            case "NPCs":
                lifeForm="o";
                break;
            case "Uninhabited":
                lifeForm="u";
                break;
            default:
                lifeForm="Invalid Life Form";
        }

        //      <<---------Law--------->>
        String law;
        switch (lawSelectedInSpinner) {
            case "Sentinels":
                law="s";
                break;
            case "Lawless":
                law="l";
                break;
            default:
                law="Invalid Law Type";
        }

        //      <<---------Structures--------->>
        String structure;
        switch (structureSelectedInSpinner) {
            case "Buildings":
                structure="bu";
                break;
            case "Monoliths":
                structure="mo";
                break;
            case "Portals":
                structure="po";
                break;
            case "Monoliths/Portals":
                structure="ma";
                break;
            case "Monoliths/Buildings":
                structure="mu";
                break;
            case "Portals/Buildings":
                structure="pu";
                break;
            case "3+":
                structure="sa";
                break;
            case "No Structures":
                structure="no";
                break;
            default:
                structure="Invalid Structure";
        }

        //      <<---------Climate--------->>
        String climate;
        switch (climateSelectedInSpinner) {
            case "Cold":
                climate="co";
                break;
            case "Hot":
                climate="me";
                break;
            case "Safe":
                climate="sa";
                break;
            case "Radioactive":
                climate="ra";
                break;
            case "Toxic":
                climate="to";
                break;
            default:
                climate="Invalid Climate";
        }

        //      <<---------Direction--------->>
        String direction;
        switch (directionSelectedInSpinner) {
            case "Going Toward Center":
                direction="GTC";
                break;
            case "Going Toward Edge":
                direction="GTE";
                break;
            case "Moving Laterally":
                direction="MOL";
                break;
            case "Staying In Solar System":
                direction="SIS";
                break;
            case "Taking Portal":
                direction="TAK";
                break;
            default:
                direction="Invalid Direction";
        }

        planetName = biome + resource + lifeForm + law + structure + climate + " " + direction;
        return planetName;
    }

    public void sendName(View view) {
        Intent nameIntent = new Intent(this, DisplayNameActivity.class);

        combineNames();

        nameIntent.putExtra(GENERATED_NAME, planetName);

        startActivity(nameIntent);
    }
}

