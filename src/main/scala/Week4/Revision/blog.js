let posts = [
  {
    id: "394",
    title: "Eat your veggies",
    content: "<h2><img class=\"alignright size-fullwp-image-379\" src=\"https://hplussport.com/wp-content/uploads/2016/05/eat-your-vegetables-466545605.jpg\" alt=\"Woman wearing apron slicing a variety of colorful vegetables\" width=\"500\" height=\"333\" />Eat your veggies</h2>\r\nWith all the vitamin supplements and nutrition products on the market, it can be difficult to make nutrition choices. However, the truth is, eating five or more servings of fruit and vegetables a day is still your best bet for getting optimal nutrition. In addition, eating your veggies won\u0092t break the bank, like so many vitamin products can. If after eating real food for optimum nutrition, you still want to take a supplement, know that all supplements are not created equal. Select only vitamins that have been evaluated by a third party laboratory to ensure the contents in the bottle match the claims on the label.",
    date: "2021-05-08 14:46:20"
  },
  {
    id: "378",
    title: "Every step counts",
    content: "<h2><img class=\"alignright wp-image-380 size-full\" src=\"https://hplussport.com/wp-content/uploads/2016/05/every-step-counts-82636724.jpg\" alt=\"Two business women walking up staircase in office building, elevated view\" width=\"500\" height=\"332\" />Every step counts</h2>\r\nMany of us spend a good deal of our waking hours sitting at desks \u0096 often for longer than a normal 40-hour week. It may even seem like work has become a major obstacle to getting regular exercise. However, there are always ways to squeeze in fitness time, and every little bit really does count. For instance, instead of emailing, calling, or chatting a coworker, take the \u0093old-fashioned\u0094 approach and actually walk to their location. And, we\u0092ve all heard this before, but take the stairs instead of the elevator. The resulting calories burned and the muscle strength built, are well worth the effort.",
    date: "2021-05-09 14:26:53"
  }
];
const postsString = JSON.stringify(posts)

let article = {
  id: "386",
  title: "Prioritize your health",
  content: "<h2><img class=\"alignright wp-image-382 size-full\" src=\"https://hplussport.com/wp-content/uploads/2016/05/prioritize- your-health-152143703.jpg\" alt=\"Doctor Checking Blood Pressure of a Woman\" width=\"500\" height=\"500\" />Prioritize your health</h2>\r\nAs with many others, you may find it difficult to prioritize your health amongst the many competing demands of a busy lifestyle. That\u0092s why it\u0092s up to you to make the conscious choice to slow down, take inventory on your health, and find ways to make improvements. The first place to start is with your annual physical. One simple visit to your doctor each year can be the most important thing you do for your health, and in most cases, it\u0092s completely covered by insurance. The annual exam can catch health issues, such as diabetes and cancer, in the early stages, giving you a much better chance at beating them down. Make a point of calling your doctor today and putting a wellness visit on your calendar. It\u0092s a great first step to prioritizing your health.",
  date: "2021-12-09 00:53:59"
};
const articleString = JSON.stringify(article)

const queue = '[{"id":"394","title":"Eat your veggies"},{"id":"378","title":"Every step counts"},{"id":"406","title":"Giving Back"}]';

// Enter code to destringify the `queue` variable here:
const queueParsed = JSON.parse(queue)

const item = '{"id":"406","title":"Giving Back"}';
// Enter code to destringify the `item` variable here:
const itemParsed = JSON.parse(item)


//
const rawData = '[{"id":"259","name":"Raspberry Mineral Water","description":"An 8-ounce serving of our refreshing H+ Sport raspberry mineral water fulfills a day\'s nutritional requirements for over 12 vitamins and minerals.","image_title":"mineral-water-raspberry_600px","image":"https://hplussport.com/wp-content/uploads/2015/12/mineral-water-raspberry_600px.png"},{"id":"429","name":"Strawberry Mineral Water","description":"An 8-ounce serving of our refreshing H+ Sport strawberry mineral water fulfills a day\'s nutritional requirements for over 12 vitamins and minerals.","image_title":"mineral-water-strawberry_600px","image":"https://hplussport.com/wp-content/uploads/2015/12/mineral-water-strawberry_600px.png"},{"id":"436","name":"Blueberry Mineral Water","description":"An 8-ounce serving of our refreshing H+ Sport blueberry mineral water fulfills a day\'s nutritional requirements for over 12 vitamins and minerals.","image_title":"mineral-water-blueberry_600px","image":"https://hplussport.com/wp-content/uploads/2015/12/minearl-water-blueberry_600px.png"},{"id":"437","name":"Lemon-Lime Mineral Water","description":"An 8-ounce serving of our refreshing H+ Sport lemon-lime\u00c2\u00a0mineral water fulfills a day\'s nutritional requirements for over 12 vitamins and minerals","image_title":"mineral-water-lemon-lime_600px","image":"https://hplussport.com/wp-content/uploads/2015/12/mineral-water-lemon-lime_600px.png"},{"id":"438","name":"Peach Mineral Water","description":"An 8-ounce serving of our refreshing H+ Sport peach mineral water \u00c2\u00a0fulfills a day\'s nutritional requirements for over 12 vitamins and minerals.","image_title":"mineral-water-peach_600px","image":"https://hplussport.com/wp-content/uploads/2015/12/mineral-water-peach_600px.png"},{"id":"439","name":"Orange Mineral Water","description":"An 8-ounce serving of refreshing H+ Sport orange mineral water fulfills a day\'s nutritional requirements for over 12 vitamins and minerals.","image_title":"mineral-water-orange_600px","image":"https://hplussport.com/wp-content/uploads/2015/12/mineral-water-orange_600px.png"}]';

  // Add statement below to parse JSON data
  // and store it as a variable called 'data'
  const data = JSON.parse(rawData); //after writing this, you can see the data which were bottles on the website!

  const container = document.querySelector('.container');

  const template = (item) => `
    <div class="item">
      <img src="${item.image}" alt="${item.name}" width="324" height="324">
      <h2>${item.name}</h2>
    </div>
  `;

  const populate = (arr) => {
    let content = "";
    arr.forEach((item) => {
      content += template(item);
    });
    container.innerHTML += content;
  };

  document.addEventListener('DOMContentLoaded', () => {
    populate(data);
  });
  // ch03/03-04/begin ///// using libraries to convert xml to JSON
  const rawData = '<?xml version="1.0"?><data><product><id>259</id><name>Raspberry Mineral Water</name><description>An 8-ounce serving of our refreshing H+ Sport raspberry mineral water fulfills a day\'s nutritional requirements for over 12 vitamins and minerals.</description><image_title>mineral-water-raspberry_600px</image_title><image>https://hplussport.com/wp-content/uploads/2015/12/mineral-water-raspberry_600px.png</image></product><product><id>429</id><name>Strawberry Mineral Water</name><description>An 8-ounce serving of our refreshing H+ Sport strawberry mineral water fulfills a day\'s nutritional requirements for over 12 vitamins and minerals.</description><image_title>mineral-water-strawberry_600px</image_title><image>https://hplussport.com/wp-content/uploads/2015/12/mineral-water-strawberry_600px.png</image></product><product><id>436</id><name>Blueberry Mineral Water</name><description>An 8-ounce serving of our refreshing H+ Sport blueberry mineral water fulfills a day\'s nutritional requirements for over 12 vitamins and minerals.</description><image_title>minearl-water-blueberry_600px</image_title><image>https://hplussport.com/wp-content/uploads/2015/12/minearl-water-blueberry_600px.png</image></product><product><id>437</id><name>Lemon-Lime Mineral Water</name><description>An 8-ounce serving of our refreshing H+ Sport lemon-lime&#xC2;&#xA0;mineral water fulfills a day\'s nutritional requirements for over 12 vitamins and minerals</description><image_title>mineral-water-lemon-lime_600px</image_title><image>https://hplussport.com/wp-content/uploads/2015/12/mineral-water-lemon-lime_600px.png</image></product><product><id>438</id><name>Peach Mineral Water</name><description>An 8-ounce serving of our refreshing H+ Sport peach mineral water &#xC2;&#xA0;fulfills a day\'s nutritional requirements for over 12 vitamins and minerals.</description><image_title>mineral-water-peach_600px</image_title><image>https://hplussport.com/wp-content/uploads/2015/12/mineral-water-peach_600px.png</image></product><product><id>439</id><name>Orange Mineral Water</name><description>An 8-ounce serving of refreshing H+ Sport orange mineral water fulfills a day\'s nutritional requirements for over 12 vitamins and minerals.</description><image_title>mineral-water-orange_600px</image_title><image>https://hplussport.com/wp-content/uploads/2015/12/mineral-water-orange_600px.png</image></product><product><id>440</id><name>Multi-Vitamin (90 capsules)</name><description>A daily dose of our Multi-Vitamins fulfills a day\'s nutritional needs for over 12 vitamins and minerals.</description><image_title>multi-vitamin_600px</image_title><image>https://hplussport.com/wp-content/uploads/2016/12/multi-vitamin_600px.png</image></product><product><id>471</id><name>Flaxseed Oil 1000 mg (90 capsules)</name><description>Our Flaxseed Oil contains Omegas 3, 6, and 9 for a heart-healthy option without the use of fish oil.</description><image_title>flaxseed-oil_600px</image_title><image>https://hplussport.com/wp-content/uploads/2016/12/flaxseed-oil_600px.png</image></product><product><id>472</id><name>Magnesium 250 mg (100 tablets)</name><description>Magnesium is critical to many bodily processes, and supports nerve, muscle, and heart function.</description><image_title>magnesium_600px</image_title><image>https://hplussport.com/wp-content/uploads/2016/12/magnesium_600px.png</image></product><product><id>473</id><name>Iron 65 mg (150 caplets)</name><description>Iron is essential for transporting oxygen in the body and for the formation of red blood cells.</description><image_title>iron_600px</image_title><image>https://hplussport.com/wp-content/uploads/2016/12/iron_600px.png</image></product><product><id>474</id><name>Calcium 400 IU (150 tablets)</name><description>Our Calcium supports strong bones and teeth and may help prevent osteoporosis.&lt;strong&gt;&#xC2;&#xA0;&lt;/strong&gt;</description><image_title>calcium_600px</image_title><image>https://hplussport.com/wp-content/uploads/2016/12/calcium_600px.png</image></product><product><id>475</id><name>Vitamin D3 1000 IU (100 tablets)</name><description>Vitamin D&lt;sub&gt;3&lt;/sub&gt; is the body\'s preferred form of Vitamin D, and helps support bone, teeth, and immune health.</description><image_title>vitamin-d_600px</image_title><image>https://hplussport.com/wp-content/uploads/2016/12/vitamin-D_600px.png</image></product><product><id>476</id><name>Vitamin A 10,000 IU (125 caplets)</name><description>Vitamin A is essential for normal and night vision, and helps maintain healthy skin and mucous membranes.</description><image_title>vitamin-a_600px</image_title><image>https://hplussport.com/wp-content/uploads/2016/12/vitamin-A_600px.png</image></product><product><id>477</id><name>Vitamin C 1000 mg (100 tablets)</name><description>Protects against free radicals and supports the immune system.</description><image_title>vitamin-c_600px</image_title><image>https://hplussport.com/wp-content/uploads/2016/12/vitamin-C_600px.png</image></product><product><id>478</id><name>Vitamin B-Complex (100 caplets)</name><description>Contains a combination of essential B vitamins that help convert food to energy.</description><image_title>b-complex_600px</image_title><image>https://hplussport.com/wp-content/uploads/2016/12/B-complex_600px.png</image></product><product><id>479</id><name>In the Kitchen with H+ Sport</name><description>Henry Twill, founder and CEO of H+ Sport, teams up with celebrity nutritionist Jill Bayner, CNS, to bring you recipes and tips designed to maximize your athletic performance, while&#xC2;&#xA0;minimizing your time in the kitchen.</description><image_title>in-the-kitchen-with-h-book-cover</image_title><image>https://hplussport.com/wp-content/uploads/2016/12/In-the-Kitchen-with-H-book-cover.png</image></product><product><id>483</id><name>Stretchy Dance Pants</name><description>Whether dancing the samba, mastering a yoga pose, or scaling the climbing wall, our stretchy dance pants, made from 80% organic cotton and 20% Lycra, are the most versatile and comfortable workout pants you\'ll ever have the pleasure of wearing.</description><image_title>stretch-dance-pants_lynda_29942</image_title><image>https://hplussport.com/wp-content/uploads/2016/12/stretch-dance-pants_LYNDA_29942.jpg</image></product><product><id>500</id><name>Thermal Fleece Jacket</name><description>Our thermal organic fleece jacket, is brushed on both sides for ultra softness and warmth. This medium-weight jacket is versatile all year around, and can be worn with layers for the winter season.</description><image_title>thermal-jacket_lynda_29943</image_title><image>https://hplussport.com/wp-content/uploads/2016/12/thermal-jacket_LYNDA_29943.jpg</image></product><product><id>510</id><name>UItra-Soft Tank Top</name><description>This versatile tank can be worn in the gym, under a blazer, or for a day out in the sun. Made from our patented organic bamboo and cotton mix, our ultra-soft tank never stops feeling soft, even when you forget the fabric softener.</description><image_title>ultra-soft-tank-top-for-women_lynda_29945</image_title><image>https://hplussport.com/wp-content/uploads/2016/12/ultra-soft-tank-top-for-women_LYNDA_29945.jpg</image></product><product><id>514</id><name>Grunge Skater Jeans</name><description>Our boy-cut jeans are for men and women who appreciate that skate park fashions aren\'t just for skaters. Made from the softest and most flexible organic cotton denim.</description><image_title>unisex-grunge-jeans_lynda_29937</image_title><image>https://hplussport.com/wp-content/uploads/2016/12/unisex-grunge-jeans_LYNDA_29937.jpg</image></product><product><id>516</id><name>Unisex Thermal Vest</name><description>Our thermal vest, made from organic bamboo with recycled plastic down filling, is a favorite of both men and women. You\'ll help the environment, and have a wear-easy piece for many occasions.</description><image_title>unisex-thermal-vest_lynda_29944</image_title><image>https://hplussport.com/wp-content/uploads/2016/12/unisex-thermal-vest_LYNDA_29944.jpg</image></product><product><id>518</id><name>V-Neck Pullover</name><description>This organic hemp jersey pullover is perfect in a pinch. Wear for casual days at the office, a game of hoops after work, or running your weekend errands.</description><image_title>v-neck-long-sleeved-pullover_lynda_29946</image_title><image>https://hplussport.com/wp-content/uploads/2016/12/v-neck-long-sleeved-pullover_LYNDA_29946.jpg</image></product><product><id>520</id><name>V-Neck Sweater</name><description>This medium-weight sweater, made from organic knitted cotton and bamboo, is the perfect solution to a chilly night at the campground or a misty walk on the beach.</description><image_title>v-neck-sweater-for-men_lynda_29947</image_title><image>https://hplussport.com/wp-content/uploads/2016/12/v-neck-sweater-for-men_LYNDA_29947.jpg</image></product><product><id>522</id><name>V-Neck T-Shirt</name><description>Our pre-shrunk organic cotton V-neck T-shirt is the ultimate in comfort and durability, with triple stitching at the collar, sleeves, and waist. So versatile you\'ll want one in every color!</description><image_title>v-neck-t-shirt-for-men_lynda_29949</image_title><image>https://hplussport.com/wp-content/uploads/2016/12/v-neck-T-shirt-for-men_LYNDA_29949.jpg</image></product><product><id>526</id><name>Polo Shirt</name><description>Our pre-shrunk organic cotton polo shirt is perfect for weekend activities, lounging around the house, and casual days at the office. With its triple-stitched sleeves and waistband, our polo has maximum durability.</description><image_title>polo-shirt_lynda_29938</image_title><image>https://hplussport.com/wp-content/uploads/2016/12/polo-shirt_LYNDA_29938.jpg</image></product><product><id>528</id><name>Skater Graphic T-Shirt</name><description>Hip at the skate park or around down, our pre-shrunk organic cotton graphic T-shirt has you covered.</description><image_title>skater-knit-shirt_lynda_29939</image_title><image>https://hplussport.com/wp-content/uploads/2016/12/skater-knit-shirt_LYNDA_29939.jpg</image></product><product><id>530</id><name>Bamboo Thermal Ski Coat</name><description>You\'ll be the most environmentally conscious skier on the slopes - and the most stylish - wearing our fitted bamboo thermal ski coat, made from organic bamboo with recycled plastic down filling.</description><image_title>ski-coat_lynda_29940</image_title><image>https://hplussport.com/wp-content/uploads/2016/12/ski-coat_LYNDA_29940.jpg</image></product><product><id>532</id><name>Slicker Jacket</name><description>Wind and rain are no match for our organic bamboo slicker jacket for men and women. Triple stitched seams, zippered pockets, and a stay-tight hood are just a few features of our best-selling jacket.</description><image_title>slicker-jacket_lynda_29941</image_title><image>https://hplussport.com/wp-content/uploads/2016/12/slicker-jacket_LYNDA_29941.jpg</image></product><product><id>534</id><name>Cross-Back Training Tank</name><description>Our cross-back training tank is made from organic cotton with 10% Lycra for form and support, and a flattering feminine cut.</description><image_title>crossback-tank_lynda_29936</image_title><image>https://hplussport.com/wp-content/uploads/2016/12/crossback-tank_LYNDA_29936.jpg</image></product><product><id>524</id><name>V-Neck T-Shirt</name><description>Our pre-shrunk organic cotton t-shirt, with its slightly fitted waist and elegant V-neck is designed to flatter. You\'ll want one in every color!</description><image_title>v-neck-t-shirt-for-women_lynda_29948</image_title><image>https://hplussport.com/wp-content/uploads/2016/12/v-neck-T-shirt-for-women_LYNDA_29948.jpg</image></product></data>';

  // convert XML formatted string to a DOM node
  var peopleDataNode = (new DOMParser()).parseFromString(rawData, "text/xml");
  // convert DOM node to JSON
  var convertedData = xml2json(peopleDataNode,"");
  // parse JSON data for use in JavaScript
  const convertedObject = JSON.parse(convertedData);
  // reference array of product data within object
  const data = convertedObject.data.product;

  const container = document.querySelector('.container');

  const template = (item) => `
    <div class="item">
      <img src="${item.image}" alt="${item.name}" width="324" height="324">
      <h2>${item.name}</h2>
    </div>
  `;

  const populate = (arr) => {
    let content = "";
    arr.forEach((item) => {
      content += template(item);
    });
    container.innerHTML += content;
  };

  document.addEventListener('DOMContentLoaded', () => {
    populate(data);
  });
  /////// 04/04-01

  ///this while(1) give an error to prevent malicious uses.
  const protectedData = 'while(1);[{"id":"259","name":"Raspberry Mineral Water","description":"An 8-ounce serving of our refreshing H+ Sport raspberry mineral water fulfills a day\'s nutritional requirements for over 12 vitamins and minerals.","image_title":"mineral-water-raspberry_600px","image":"https://hplussport.com/wp-content/uploads/2015/12/mineral-water-raspberry_600px.png"},{"id":"429","name":"Strawberry Mineral Water","description":"An 8-ounce serving of our refreshing H+ Sport strawberry mineral water fulfills a day\'s nutritional requirements for over 12 vitamins and minerals.","image_title":"mineral-water-strawberry_600px","image":"https://hplussport.com/wp-content/uploads/2015/12/mineral-water-strawberry_600px.png"},{"id":"436","name":"Blueberry Mineral Water","description":"An 8-ounce serving of our refreshing H+ Sport blueberry mineral water fulfills a day\'s nutritional requirements for over 12 vitamins and minerals.","image_title":"mineral-water-blueberry_600px","image":"https://hplussport.com/wp-content/uploads/2015/12/minearl-water-blueberry_600px.png"},{"id":"437","name":"Lemon-Lime Mineral Water","description":"An 8-ounce serving of our refreshing H+ Sport lemon-lime\u00c2\u00a0mineral water fulfills a day\'s nutritional requirements for over 12 vitamins and minerals","image_title":"mineral-water-lemon-lime_600px","image":"https://hplussport.com/wp-content/uploads/2015/12/mineral-water-lemon-lime_600px.png"},{"id":"438","name":"Peach Mineral Water","description":"An 8-ounce serving of our refreshing H+ Sport peach mineral water \u00c2\u00a0fulfills a day\'s nutritional requirements for over 12 vitamins and minerals.","image_title":"mineral-water-peach_600px","image":"https://hplussport.com/wp-content/uploads/2015/12/mineral-water-peach_600px.png"},{"id":"439","name":"Orange Mineral Water","description":"An 8-ounce serving of refreshing H+ Sport orange mineral water fulfills a day\'s nutritional requirements for over 12 vitamins and minerals.","image_title":"mineral-water-orange_600px","image":"https://hplussport.com/wp-content/uploads/2015/12/mineral-water-orange_600px.png"}]';

  console.log(protectedData);

  // add statement to clean protected data
  const cleanData = rawData => rawData.slice(9); // 1- remove the while(1)

  // update statement to parse cleaned data
  const data = JSON.parse(cleanData(protectedData));// 2- use cleanData here to use the data without while(1)

  console.log(data);

  const container = document.querySelector('.container');

  const template = (item) => `
    <div class="item">
      <img src="${item.image}" alt="${item.name}" width="324" height="324">
      <h2>${item.name}</h2>
    </div>
  `;

  const populate = (arr) => {
    let content = "";
    arr.forEach((item) => {
      content += template(item);
    });
    container.innerHTML += content;
  };

  document.addEventListener('DOMContentLoaded', () => {
    populate(data);
  });



  //// Ch04/04_02/begin/script.js
  const rawData = '[{"id":"259","name":"Raspberry Mineral Water","description":"An 8-ounce serving of our refreshing H+ Sport raspberry mineral water fulfills a day\'s nutritional requirements for over 12 vitamins and minerals.","image_title":"mineral-water-raspberry_600px","image":"https://hplussport.com/wp-content/uploads/2015/12/mineral-water-raspberry_600px.png"},{"id":"429","name":"Strawberry Mineral Water","description":"An 8-ounce serving of our refreshing H+ Sport strawberry mineral water fulfills a day\'s nutritional requirements for over 12 vitamins and minerals.","image_title":"mineral-water-strawberry_600px","image":"https://hplussport.com/wp-content/uploads/2015/12/mineral-water-strawberry_600px.png"},{"id":"436","name":"Blueberry Mineral Water","description":"An 8-ounce serving of our refreshing H+ Sport blueberry mineral water fulfills a day\'s nutritional requirements for over 12 vitamins and minerals.","image_title":"mineral-water-blueberry_600px","image":"https://hplussport.com/wp-content/uploads/2015/12/minearl-water-blueberry_600px.png"},{"id":"437","name":"Lemon-Lime Mineral Water","description":"An 8-ounce serving of our refreshing H+ Sport lemon-lime\u00c2\u00a0mineral water fulfills a day\'s nutritional requirements for over 12 vitamins and minerals","image_title":"mineral-water-lemon-lime_600px","image":"https://hplussport.com/wp-content/uploads/2015/12/mineral-water-lemon-lime_600px.png"},{"id":"438","name":"Peach Mineral Water","description":"An 8-ounce serving of our refreshing H+ Sport peach mineral water \u00c2\u00a0fulfills a day\'s nutritional requirements for over 12 vitamins and minerals.","image_title":"mineral-water-peach_600px","image":"https://hplussport.com/wp-content/uploads/2015/12/mineral-water-peach_600px.png"},{"id":"439","name":"Orange Mineral Water","description":"An 8-ounce serving of refreshing H+ Sport orange mineral water fulfills a day\'s nutritional requirements for over 12 vitamins and minerals.","image_title":"mineral-water-orange_600px","image":"https://hplussport.com/wp-content/uploads/2015/12/mineral-water-orange_600px.png"}]';

  console.log(rawData);

  const data = JSON.parse(rawData);
  console.log(data);

  // add statement to stringify `data` with line breaks
  // and indents, and log the result to the console
  console.log(JSON.stringify(data, null, 4)); ////null = replacer which is a function but because we do not have it right now, 4 = spacer which customize indents for levels of hierarchy

  const container = document.querySelector('.container');

  const template = (item) => `
    <div class="item">
      <img src="${item.image}" alt="${item.name}" width="324" height="324">
      <h2>${item.name}</h2>
    </div>
  `;

  const populate = (arr) => {
    let content = "";
    arr.forEach((item) => {
      content += template(item);
    });
    container.innerHTML += content;
  };

  document.addEventListener('DOMContentLoaded', () => {
    populate(data);
  });

  ////Ch04/04_03/begin/index.html


  /////
  <!DOCTYPE html>
  <html>
  <head>
      <title>Testing for an empty object</title>
  </head>
  <body>
    <script>
      const emptyObject = {};
      const nonEmptyObject = { apples: "red" };
      const stringContent = "banana";
      const numberContent = 5;
      const arrayContent = [ "asparagus", "lettuce", "kale" ];
      const dateContent = new Date();

      const testData = (data) => {   ///to test at video for not modern browsers
        for (prop in data) {
          if (hasOwnProperty === true) {
            console.log("Not an Empty Object:");
            return data;
          }
        }
        if (JSON.stringify(data) === JSON.stringify({})) {
        if (JSON.stringify(data) === JSON.stringify({})) { //empty object { }
          console.log("Empty Object:");
          return data;
        } else {
          console.log("Not an Empty Object:");
          return data;
        }
        // if (Object.keys(data).length === 0 && data.constructor === Object) {   ///to test at video for modern browsers
        //   console.log("Empty Object:");
        //   return data;
        // } else {
        //   console.log("Not an Empty Object:");
        //   return data;
        // }
      }
    </script>
  </body>
  </html>


  /// Ch05/05_02/begin/js/data.js

  const rawProductData = '[{"id":"259","name":"Raspberry Mineral Water","description":"An 8-ounce serving of our refreshing H+ Sport raspberry mineral water fulfills a day&#31;s nutritional requirements for over 12 vitamins and minerals.","image_title":"mineral-water-raspberry_600px","image":"https://hplussport.com/wp-content/uploads/2015/12/mineral-water-raspberry_600px.png"},{"id":"429","name":"Strawberry Mineral Water","description":"An 8-ounce serving of our refreshing H+ Sport strawberry mineral water fulfills a day&#31;s nutritional requirements for over 12 vitamins and minerals.","image_title":"mineral-water-strawberry_600px","image":"https://hplussport.com/wp-content/uploads/2015/12/mineral-water-strawberry_600px.png"},{"id":"436","name":"Blueberry Mineral Water","description":"An 8-ounce serving of our refreshing H+ Sport blueberry mineral water fulfills a day&#31;s nutritional requirements for over 12 vitamins and minerals.","image_title":"mineral-water-blueberry_600px","image":"https://hplussport.com/wp-content/uploads/2015/12/minearl-water-blueberry_600px.png"},{"id":"437","name":"Lemon-Lime Mineral Water","description":"An 8-ounce serving of our refreshing H+ Sport lemon-lime\u00c2\u00a0mineral water fulfills a day&#31;s nutritional requirements for over 12 vitamins and minerals","image_title":"mineral-water-lemon-lime_600px","image":"https://hplussport.com/wp-content/uploads/2015/12/mineral-water-lemon-lime_600px.png"},{"id":"438","name":"Peach Mineral Water","description":"An 8-ounce serving of our refreshing H+ Sport peach mineral water \u00c2\u00a0fulfills a day&#31;s nutritional requirements for over 12 vitamins and minerals.","image_title":"mineral-water-peach_600px","image":"https://hplussport.com/wp-content/uploads/2015/12/mineral-water-peach_600px.png"},{"id":"439","name":"Orange Mineral Water","description":"An 8-ounce serving of refreshing H+ Sport orange mineral water fulfills a day&#31;s nutritional requirements for over 12 vitamins and minerals.","image_title":"mineral-water-orange_600px","image":"https://hplussport.com/wp-content/uploads/2015/12/mineral-water-orange_600px.png"}]';

  const rawPersonData = '{"cards":[{"img":{"src":"HenryTwill.jpg","alt":"HenryTwill Photo"},"cardInfo":{"cardName":"Henry Twill, Jr","cardTitle":"CEO"},"cardText":"Henry Twill Jr. is the founder and CEO of H+ Sports. Previously he was an athletic trainer working with several top athletes, making sure that they had the direction and proper coaching to keep them at the top of their game. Henry’s passion for finding natural alternatives led him to developing H+ Sport Multivitamins. The supplements became a success with his clients and led to the creation of H+ Sports."},{"img":{"src":"JessicaNewton.jpg","alt":"JessicaNewton Photo"},"cardInfo":{"cardName":"Jessica Newton-Smith, MBA","cardTitle":"CFO"},"cardText":"Jessica Newton-Smith joined us in 2012 and brings more than 10 years of financial management experience to H+ Sports, spanning a variety of companies and industries ranging from  Fortune 500 agencies to start-ups. She has extensive experience working in emerging markets and in the consumer and retail sectors."},{"img":{"src":"PhiTang.jpg","alt":"PhiTang Photo"},"cardInfo":{"cardName":"Phi Tang, MBA","cardTitle":"Director of Product Development"},"cardText":"Phi Tang joined H+ Sports in 2007 as Manager of Marketing Research. He was promoted to Director of Product Development in 2011. He has made major contributions to the discovery, development, and implementation of the H+ Sport product lines. Before joining the company he worked as a scientific expert and brings vast knowledge of ingredients and new technologies."},{"img":{"src":"MariaSontas.jpg","alt":"MariaSontas Photo"},"cardInfo":{"cardName":"Maria Sontas","cardTitle":"Director of Marketing"},"cardText":"Maria Sontas has been with H+ Sport since 2010. She oversees the company’s marketing strategy – ensuring advertising campaigns, social media initiatives, and events are planned to position the company strongly in a competitive marketplace. Maria is a competing triathlete and her passion for our products shows in her unique ability to drive awareness and increase our presence around the world."},{"img":{"src":"AngelaHaston.jpg","alt":"AngelaHaston Photo"},"cardInfo":{"cardName":"Angela Hashton","cardTitle":"Director of Sales"},"cardText":"Angela Hashton joined the company in 2009, to initiate new relationships for our growing line of H+ Sports active apparel. After being with the company for a year, she was promoted to Director of Sales. Angela is the drive behind the H+ Sport ACTIVE product line and has an uncanny ability to formulate strategies that have helped build our unified sales force. Educating people about health and nutrition is something that Angela holds dear."},{"img":{"src":"MichaelLewiston.jpg","alt":"MichaelLewiston Photo"},"cardInfo":{"cardName":"Michael Lewiston, MFA","cardTitle":"Creative Director"},"cardText":"Michael Lewiston is a multi-faceted creative person who began his career as a designer for a small business firm, while also working as an independent painter and sculptor. In 2007, Henry Twill was impressed by Michael’s creative work in a national ad campaign for a high profile sports apparel company. Henry approached Michael, and asked him to manage creative direction for the H+ Sport ACTIVE apparel line."}]}';
  //Ch05/05_02/begin/js/schema.js
  // Schema for product data
  var productSchema = {
    "$schema": "http://json-schema.org/draft-07/schema#", ///this is JSON schema
    "$id": "http://hplussport.com/schemas/products.json",
    "title": "h+ Sport products",
    "description": "Schema for h+ Sport product data.",
    "type": "array",
    "items": {
      "type": "object",
      "properties": {
        "id": {
          "type": "string"
        },
        "name": { // the order in object is not matter, so instead of name, i could have "image_title"
          "type": "string"
        },
        "description": {
          "type": "string"
        },
        "image_title": {
          "type": "string"
        },
        "image": {
          "type": "string"
        },
      }
    }
  };
//https://json-schema.org/tools?query=&sortBy=name&sortOrder=ascending&groupBy=toolingTypes&licenses=&languages=&drafts=&toolingTypes=validator&environments=&showObsolete=false#validator




//Ch05/05_04/begin/schema.js
//
// Schema for product data
var productSchema = {
  "$schema": "http://json-schema.org/draft-07/schema#",
  "$id": "http://hplussport.com/schemas/products.json",
  "title": "h+ Sport Products",
  "description": "Schema for h+ Sport product data",
  "type": "array",
  "items": {
    "type": "object",
    "properties": {
      "id": {
          "type": "string"
      },
      "name": {
          "type": "string"
      },
      "description": {
          "type": "string"
      },
      "image_title": {
          "type": "string"
      },
      "image": {
        "type": "string"
      }
    },
    "required": [ // when the properties is required, should add it after all the objects but in the same level of the properties
      "id",
      "name",
      "description",
      "image_title",
      "image"
    ]
  }
};
// the validation JSON data against a schema, the site does not exist: http://www.npm.runkit.com/

//Ch05/05_05/begin/data.js
//schema generator : https://www.jsonschema.net
const rawProductData = '[{"id":"259","name":"Raspberry Mineral Water","description":"An 8-ounce serving of our refreshing H+ Sport raspberry mineral water fulfills a day&#31;s nutritional requirements for over 12 vitamins and minerals.","image_title":"mineral-water-raspberry_600px","image":"https://hplussport.com/wp-content/uploads/2015/12/mineral-water-raspberry_600px.png"},{"id":"429","name":"Strawberry Mineral Water","description":"An 8-ounce serving of our refreshing H+ Sport strawberry mineral water fulfills a day&#31;s nutritional requirements for over 12 vitamins and minerals.","image_title":"mineral-water-strawberry_600px","image":"https://hplussport.com/wp-content/uploads/2015/12/mineral-water-strawberry_600px.png"},{"id":"436","name":"Blueberry Mineral Water","description":"An 8-ounce serving of our refreshing H+ Sport blueberry mineral water fulfills a day&#31;s nutritional requirements for over 12 vitamins and minerals.","image_title":"mineral-water-blueberry_600px","image":"https://hplussport.com/wp-content/uploads/2015/12/minearl-water-blueberry_600px.png"},{"id":"437","name":"Lemon-Lime Mineral Water","description":"An 8-ounce serving of our refreshing H+ Sport lemon-lime\u00c2\u00a0mineral water fulfills a day&#31;s nutritional requirements for over 12 vitamins and minerals","image_title":"mineral-water-lemon-lime_600px","image":"https://hplussport.com/wp-content/uploads/2015/12/mineral-water-lemon-lime_600px.png"},{"id":"438","name":"Peach Mineral Water","description":"An 8-ounce serving of our refreshing H+ Sport peach mineral water \u00c2\u00a0fulfills a day&#31;s nutritional requirements for over 12 vitamins and minerals.","image_title":"mineral-water-peach_600px","image":"https://hplussport.com/wp-content/uploads/2015/12/mineral-water-peach_600px.png"},{"id":"439","name":"Orange Mineral Water","description":"An 8-ounce serving of refreshing H+ Sport orange mineral water fulfills a day&#31;s nutritional requirements for over 12 vitamins and minerals.","image_title":"mineral-water-orange_600px","image":"https://hplussport.com/wp-content/uploads/2015/12/mineral-water-orange_600px.png"}]';

const rawPersonData = '{"cards":[{"img":{"src":"HenryTwill.jpg","alt":"HenryTwill Photo"},"cardInfo":{"cardName":"Henry Twill, Jr","cardTitle":"CEO"},"cardText":"Henry Twill Jr. is the founder and CEO of H+ Sports. Previously he was an athletic trainer working with several top athletes, making sure that they had the direction and proper coaching to keep them at the top of their game. Henry’s passion for finding natural alternatives led him to developing H+ Sport Multivitamins. The supplements became a success with his clients and led to the creation of H+ Sports."},{"img":{"src":"JessicaNewton.jpg","alt":"JessicaNewton Photo"},"cardInfo":{"cardName":"Jessica Newton-Smith, MBA","cardTitle":"CFO"},"cardText":"Jessica Newton-Smith joined us in 2012 and brings more than 10 years of financial management experience to H+ Sports, spanning a variety of companies and industries ranging from  Fortune 500 agencies to start-ups. She has extensive experience working in emerging markets and in the consumer and retail sectors."},{"img":{"src":"PhiTang.jpg","alt":"PhiTang Photo"},"cardInfo":{"cardName":"Phi Tang, MBA","cardTitle":"Director of Product Development"},"cardText":"Phi Tang joined H+ Sports in 2007 as Manager of Marketing Research. He was promoted to Director of Product Development in 2011. He has made major contributions to the discovery, development, and implementation of the H+ Sport product lines. Before joining the company he worked as a scientific expert and brings vast knowledge of ingredients and new technologies."},{"img":{"src":"MariaSontas.jpg","alt":"MariaSontas Photo"},"cardInfo":{"cardName":"Maria Sontas","cardTitle":"Director of Marketing"},"cardText":"Maria Sontas has been with H+ Sport since 2010. She oversees the company’s marketing strategy – ensuring advertising campaigns, social media initiatives, and events are planned to position the company strongly in a competitive marketplace. Maria is a competing triathlete and her passion for our products shows in her unique ability to drive awareness and increase our presence around the world."},{"img":{"src":"AngelaHaston.jpg","alt":"AngelaHaston Photo"},"cardInfo":{"cardName":"Angela Hashton","cardTitle":"Director of Sales"},"cardText":"Angela Hashton joined the company in 2009, to initiate new relationships for our growing line of H+ Sports active apparel. After being with the company for a year, she was promoted to Director of Sales. Angela is the drive behind the H+ Sport ACTIVE product line and has an uncanny ability to formulate strategies that have helped build our unified sales force. Educating people about health and nutrition is something that Angela holds dear."},{"img":{"src":"MichaelLewiston.jpg","alt":"MichaelLewiston Photo"},"cardInfo":{"cardName":"Michael Lewiston, MFA","cardTitle":"Creative Director"},"cardText":"Michael Lewiston is a multi-faceted creative person who began his career as a designer for a small business firm, while also working as an independent painter and sculptor. In 2007, Henry Twill was impressed by Michael’s creative work in a national ad campaign for a high profile sports apparel company. Henry approached Michael, and asked him to manage creative direction for the H+ Sport ACTIVE apparel line."}]}';
 //the result of Generate JSON got from this site https://jsonschema.net/app/schemas/540411
 {
     "$schema": "https://json-schema.org/draft/2019-09/schema",
     "$id": "http://example.com/example.json",
     "title": "Root Schema",
     "type": "object",
     "default": {},
     "required": [
         "cards"
     ],
     "properties": {
         "cards": {
             "title": "The cards Schema",
             "type": "array",
             "default": [],
             "items": {
                 "title": "A Schema",
                 "type": "object",
                 "required": [
                     "img",
                     "cardInfo",
                     "cardText"
                 ],
                 "properties": {
                     "img": {
                         "title": "The img Schema",
                         "type": "object",
                         "required": [
                             "src",
                             "alt"
                         ],
                         "properties": {
                             "src": {
                                 "title": "The src Schema",
                                 "type": "string"
                             },
                             "alt": {
                                 "title": "The alt Schema",
                                 "type": "string"
                             }
                         }
                     },
                     "cardInfo": {
                         "title": "The cardInfo Schema",
                         "type": "object",
                         "required": [
                             "cardName",
                             "cardTitle"
                         ],
                         "properties": {
                             "cardName": {
                                 "title": "The cardName Schema",
                                 "type": "string"
                             },
                             "cardTitle": {
                                 "title": "The cardTitle Schema",
                                 "type": "string"
                             }
                         }
                     },
                     "cardText": {
                         "title": "The cardText Schema",
                         "type": "string"
                     }
                 }
             }
         }
     }
 }
 //the below code is the same as above:
 //Ch05/05_05/begin/schema.js
 // Schema for product data
 var productSchema = {
   "$schema": "http://json-schema.org/draft-07/schema#",
   "$id": "http://hplussport.com/schemas/products.json",
   "title": "h+ Sport Products",
   "description": "Schema for h+ Sport product data",
   "type": "array",
   "items": {
     "type": "object",
     "properties": {
       "id": {
           "type": "string"
       },
       "name": {
           "type": "string"
       },
       "description": {
           "type": "string"
       },
       "image_title": {
           "type": "string"
       },
       "image": {
         "type": "string"
       }
     },
     "required": [
       "id",
       "name",
       "description",
       "image_title",
       "image"
     ]
   }
 };

 var personSchema = {
   "$schema": "http://json-schema.org/draft-07/schema",
   "$id": "http://hplussport.com/schemas/person.json",
   "type": "object",
   "title": "h+ Sport People",
   "description": "Schema for h+ Sport person cards.",
   "default": {},
   "required": [
       "cards"
   ],
   "properties": {
       "cards": {
           "$id": "#/properties/cards",
           "type": "array",
           "title": "The cards schema",
           "description": "An explanation about the purpose of this instance.",
           "default": [],
           "items": {
               "$id": "#/properties/cards/items",
               "anyOf": [
                   {
                       "$id": "#/properties/cards/items/anyOf/0",
                       "type": "object",
                       "title": "The first anyOf schema",
                       "description": "An explanation about the purpose of this instance.",
                       "default": {},
                       "required": [
                           "img",
                           "cardInfo",
                           "cardText"
                       ],
                       "properties": {
                           "img": {
                               "$id": "#/properties/cards/items/anyOf/0/properties/img",
                               "type": "object",
                               "title": "The img schema",
                               "description": "An explanation about the purpose of this instance.",
                               "default": {},
                               "required": [
                                   "src",
                                   "alt"
                               ],
                               "properties": {
                                   "src": {
                                       "$id": "#/properties/cards/items/anyOf/0/properties/img/properties/src",
                                       "type": "string",
                                       "title": "The src schema",
                                       "description": "An explanation about the purpose of this instance.",
                                       "default": ""
                                   },
                                   "alt": {
                                       "$id": "#/properties/cards/items/anyOf/0/properties/img/properties/alt",
                                       "type": "string",
                                       "title": "The alt schema",
                                       "description": "An explanation about the purpose of this instance.",
                                       "default": ""
                                   }
                               },
                               "additionalProperties": true
                           },
                           "cardInfo": {
                               "$id": "#/properties/cards/items/anyOf/0/properties/cardInfo",
                               "type": "object",
                               "title": "The cardInfo schema",
                               "description": "An explanation about the purpose of this instance.",
                               "default": {},
                               "required": [
                                   "cardName",
                                   "cardTitle"
                               ],
                               "properties": {
                                   "cardName": {
                                       "$id": "#/properties/cards/items/anyOf/0/properties/cardInfo/properties/cardName",
                                       "type": "string",
                                       "title": "The cardName schema",
                                       "description": "An explanation about the purpose of this instance.",
                                       "default": ""
                                   },
                                   "cardTitle": {
                                       "$id": "#/properties/cards/items/anyOf/0/properties/cardInfo/properties/cardTitle",
                                       "type": "string",
                                       "title": "The cardTitle schema",
                                       "description": "An explanation about the purpose of this instance.",
                                       "default": ""
                                   }
                               },
                               "additionalProperties": true
                           },
                           "cardText": {
                               "$id": "#/properties/cards/items/anyOf/0/properties/cardText",
                               "type": "string",
                               "title": "The cardText schema",
                               "description": "An explanation about the purpose of this instance.",
                               "default": ""
                           }
                       },
                       "additionalProperties": true
                   }
               ]
           }
       }
   },
   "additionalProperties": true
 };
 //Ch05/05_06/begin/data.js
 const rawWeatherData = '[{"id":"3033","name":"Pondicherry","name_ascii":"Pondicherry","lat":"11.93499371","lng":"79.83000037","population":"227411","country_id":"88","province":"Puducherry","country_name":"India","unit":"F","season":"spring","forecast":[{"date":"06\/06\/2021","temp_min":84.919999999999987494447850622236728668212890625,"temp_max":85.063999999999992951416061259806156158447265625,"season_min":84.650000000000005684341886080801486968994140625,"season_max":87.349999999999994315658113919198513031005859375,"condition_name":"rain","condition_desc":"Wet and rainy","condition_video":"http:\/\/explorecalifornia.org\/api\/media\/rain_28580841.mp4","condition_icon":"http:\/\/explorecalifornia.org\/api\/media\/rain_16240.png"},{"date":"06\/07\/2021","temp_min":84.7039999999999935198502498678863048553466796875,"temp_max":85.96399999999999863575794734060764312744140625,"season_min":84.650000000000005684341886080801486968994140625,"season_max":87.349999999999994315658113919198513031005859375,"condition_name":"sun","condition_desc":"Blue skies all day long!","condition_video":"http:\/\/explorecalifornia.org\/api\/media\/sun_4623792.mp4","condition_icon":"http:\/\/explorecalifornia.org\/api\/media\/sun_16240.png"},{"date":"06\/08\/2021","temp_min":84.7399999999999948840923025272786617279052734375,"temp_max":84.830000000000012505552149377763271331787109375,"season_min":84.650000000000005684341886080801486968994140625,"season_max":87.349999999999994315658113919198513031005859375,"condition_name":"cloudy","condition_desc":"Partially cloudy day","condition_video":"http:\/\/explorecalifornia.org\/api\/media\/cloudy_45449.mp4","condition_icon":"http:\/\/explorecalifornia.org\/api\/media\/cloudy_16240.png"},{"date":"06\/09\/2021","temp_min":84.8119999999999976125764078460633754730224609375,"temp_max":86.198000000000007503331289626657962799072265625,"season_min":84.650000000000005684341886080801486968994140625,"season_max":87.349999999999994315658113919198513031005859375,"condition_name":"rain","condition_desc":"Wet and rainy","condition_video":"http:\/\/explorecalifornia.org\/api\/media\/rain_28580841.mp4","condition_icon":"http:\/\/explorecalifornia.org\/api\/media\/rain_16240.png"},{"date":"06\/10\/2021","temp_min":84.7579999999999955662133288569748401641845703125,"temp_max":86.539999999999992041921359486877918243408203125,"season_min":84.650000000000005684341886080801486968994140625,"season_max":87.349999999999994315658113919198513031005859375,"condition_name":"cloudy","condition_desc":"Partially cloudy day","condition_video":"http:\/\/explorecalifornia.org\/api\/media\/cloudy_45449.mp4","condition_icon":"http:\/\/explorecalifornia.org\/api\/media\/cloudy_16240.png"},{"date":"06\/11\/2021","temp_min":85.424000000000006593836587853729724884033203125,"temp_max":85.657999999999987039700499735772609710693359375,"season_min":84.650000000000005684341886080801486968994140625,"season_max":87.349999999999994315658113919198513031005859375,"condition_name":"storm","condition_desc":"Watch out for storms!","condition_video":"http:\/\/explorecalifornia.org\/api\/media\/storm_190935.mp4","condition_icon":"http:\/\/explorecalifornia.org\/api\/media\/storm_16240.png"},{"date":"06\/12\/2021","temp_min":84.650000000000005684341886080801486968994140625,"temp_max":84.7759999999999962483343551866710186004638671875,"season_min":84.650000000000005684341886080801486968994140625,"season_max":87.349999999999994315658113919198513031005859375,"condition_name":"cloudy","condition_desc":"Partially cloudy day","condition_video":"http:\/\/explorecalifornia.org\/api\/media\/cloudy_45449.mp4","condition_icon":"http:\/\/explorecalifornia.org\/api\/media\/cloudy_16240.png"},{"date":"06\/13\/2021","temp_min":84.650000000000005684341886080801486968994140625,"temp_max":85.099999999999994315658113919198513031005859375,"season_min":84.650000000000005684341886080801486968994140625,"season_max":87.349999999999994315658113919198513031005859375,"condition_name":"rain","condition_desc":"Wet and rainy","condition_video":"http:\/\/explorecalifornia.org\/api\/media\/rain_28580841.mp4","condition_icon":"http:\/\/explorecalifornia.org\/api\/media\/rain_16240.png"},{"date":"06\/14\/2021","temp_min":84.7039999999999935198502498678863048553466796875,"temp_max":86,"season_min":84.650000000000005684341886080801486968994140625,"season_max":87.349999999999994315658113919198513031005859375,"condition_name":"rain","condition_desc":"Wet and rainy","condition_video":"http:\/\/explorecalifornia.org\/api\/media\/rain_28580841.mp4","condition_icon":"http:\/\/explorecalifornia.org\/api\/media\/rain_16240.png"},{"date":"06\/15\/2021","temp_min":84.7039999999999935198502498678863048553466796875,"temp_max":84.8840000000000003410605131648480892181396484375,"season_min":84.650000000000005684341886080801486968994140625,"season_max":87.349999999999994315658113919198513031005859375,"condition_name":"rain","condition_desc":"Wet and rainy","condition_video":"http:\/\/explorecalifornia.org\/api\/media\/rain_28580841.mp4","condition_icon":"http:\/\/explorecalifornia.org\/api\/media\/rain_16240.png"},{"date":"06\/16\/2021","temp_min":84.7039999999999935198502498678863048553466796875,"temp_max":84.7039999999999935198502498678863048553466796875,"season_min":84.650000000000005684341886080801486968994140625,"season_max":87.349999999999994315658113919198513031005859375,"condition_name":"sun","condition_desc":"Blue skies all day long!","condition_video":"http:\/\/explorecalifornia.org\/api\/media\/sun_4623792.mp4","condition_icon":"http:\/\/explorecalifornia.org\/api\/media\/sun_16240.png"}]}]';

 //////////////////////////////////////////////////////////////////////////////////////
 /// HTTP///
 //postman
 //https://insomnia.rest
 //vscode Rest Client extension ///plane text