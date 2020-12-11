package com.streetcoding.myapplication;

import java.util.ArrayList;

public class CatsData {
    private static String[] catNames = {
            "Bengal",
            "Himalayan",
            "Maine Coon",
            "Manx",
            "Sphynx",
            "Turkish Angora",
            "Singapura",
            "Munchkin",
            "Norwegian Forest",
            "Persian",
            "Ragdoll",
            "Savannah",
            "Scottish Fold"
    };

    private static String[] catDetails = {
            "Bengal Cats are curious and confident with the tameness of a domestic tabby and the beauty of an Asian Leopard Cat. Learn more about Bengals and their playful personality, plus information on their health and how to feed them.",
            "The Himalayan Cat is a sweet and mild-tempered feline. She’s affectionate but selective. Although she loves lying in your lap and being pet, she may be reserved around guests. Serene, quiet environments with few day-to-day changes are best for the Himmie.",
            "Maine Coon cats are gentle natured and friendly, making them good companions. They are often tenderly playful and curious, making them kitten-like throughout their lives.",
            "When she’s not hunting bugs or rodents or standing guard, the Manx is an affectionate, even-tempered and playful cat. She loves to follow her favorite person from room to room and curling up on their lap for a snooze. Your Manx will even carry on a conversation with you in her quiet trill.",
            "The hairless Sphynx is muscular with broad ears, a wide-eyed, friendly expression, and an affectionate personality to match",
            "The Turkish Angora may have been the first longhair cat breed in Europe, and maintains the status of a national treasure in her native country, Turkey",
            "The smallest domestic cat breed, the Singapura is an extroverted, playful feline sometimes called a “pesky people cat.” This breed thrives on attention and interactive play. Called Pura for short, these cats are intelligent and keenly observant. Friendly and social, they enjoy cats and cat friendly dogs, but dislike loud noises so are not ideal for busy households with boisterous children",
            "They may have short legs, but Munchkin Cats don’t let it hold them back. Although they can’t make big leaps like other breeds, they can make small jumps, climb and even sit back on their haunches to get a better look at something.",
            "The Norwegian Forest Cat is a gentle giant. They’re large and athletic, so you may find them sitting atop the highest point in your home, and they have no qualms about jumping down. Norwegian Forest Cats are fond of their family but are reserved with visitors.",
            "The docile Persian is a quiet feline who enjoys a calm and relaxing environment. Although she enjoys sitting in her humans’ laps and being pet, she’s just as happy to sit and observe everyone’s comings and goings from afar. Persians are independent and selective in who they show affection to.",
            "Ragdolls are loving, smart and playful. They show affection to their people by greeting them, following them around, sitting in their laps and snuggling in bed. Ragdoll cats can also learn tricks and certain behaviors with positive reinforcement.",
            "The Savannah Cat’s personality is playful, adventurous and loyal. Unlike most cats, she loves to play in water and can even be trained to walk on a leash and play fetch. Don’t be fooled by her dog-like personality, though.",
            "The smart and friendly Scottish Fold loves playing with challenging, puzzling toys to test her intelligence. She also loves human interaction with her people and loves attention. Scottish Folds prefer the company of their humans or other cats (or cat-friendly dogs), rather than being left alone for hours at a time."
    };

    private static String[] catHistory = {
            "Characteristics\n" +
                    "\n" +
                    "Bengal Cats have an athletic appearance with well-defined muscles, creating a lean, balanced appearance. They feature high cheekbones, dark markings around the eyes and the ears are small and pointed but round at the tips. Their coats have a unique, plush feel unlike any other cat breed.\n" +
                    "Lifespan\n" +
                    "\n" +
                    "12 to 16 years\n" +
                    "Colors\n" +
                    "\n" +
                    "One of the most distinctive features of this feline is its unique coat pattern and color. Most Bengal Cats’ coats have rich, highly contrasted shades of bright orange to light brown, with dark spots or a distinctive marbling pattern. Some even have a “glitter” to the tips of their fur, which glistens when the light hits it.\n" +
                    "Shedding\n" +
                    "\n" +
                    "A Bengal is fairly low maintenance. She won’t shed much and is an efficient self-groomer.\n" +
                    "Health\n" +
                    "\n" +
                    "Although responsible breeders make every effort to avoid health complications and genetic disorders in their felines, there are some conditions you should be aware of.\n" +
                    "\n" +
                    "Bengals may suffer from distal neuropathy and flat-chested kitten syndrome, both of which typically resolve on their own as the kitties mature. As they age, Bengals may develop other problems like hip dysplasia, hypertrophic cardiomyopathy, patellar luxation and progressive retinal atrophy.\n" +
                    "Choosing the Best Food for Bengal Cats\n" +
                    "\n" +
                    "Because of their energetic nature, Bengals need a complete and balanced cat food rich in protein, such as Pro Plan Savor or Pro Plan True Nature dry and wet food. Always consult with your veterinarian if you have any questions or concerns, and slowly transition your feline companions to a new food to avoid digestive upset.\n" +
                    "\n" +
                    "To explore other products for your Bengal Cat, see our Product Selector.\n" +
                    "Choosing the Best Food for Bengal Kittens\n" +
                    "\n" +
                    "Bengal kittens need additional nutrients to support their growth and development. Consider a kitten food like Pro Plan Focus Kitten dry and wet products or Pro Plan True Nature Kitten Grain Free dry and wet products to provide your kitty everything she needs to reach her full potential.\n" +
                    "History\n" +
                    "\n" +
                    "The Bengal Cat is a hybrid of a domestic cat with the wild Asian Leopard Cat. The first crossbreed was performed by Jean Mill in 1963, but the hybrid wasn’t perfected until the mid-1980s. Today, Bengals are bred only with each other.\n" +
                    "Facts\n" +
                    "\n" +
                    "The Bengal Cat’s name comes from the scientific name for the Asian Leopard Cat, Prionailurus bengalensis.\n" +
                    "\n" +
                    "    Bengals are the only domestic cat with rosettes that resemble the markings on leopards, jaguars and ocelots.\n" +
                    "    The International Cat Association (TICA) accepted the Bengal for championship status in 1991 and the American Cat Fanciers Association (ACFA) accepted the breed shortly thereafter.\n" +
                    "    The ACFA rescinded their acceptance after second-generation felines reportedly caused problems at cat shows. The Bengal was reinstated to ACFA in 1997 with the caveat that any cats shown had to be fifth generation.\n",
            "Characteristics\n" +
                    "\n" +
                    "Aside from her colorpoint and eye color, she resembles the Persian in nearly every other way. Himalayans have a large, round head with wide-set, round eyes, a short nose and full cheeks. Her face is topped with small, round-tipped ears. Himalayans are not fat cats, but instead have a sturdy, muscular body with a thick neck and short, strong legs.\n" +
                    "Lifespan\n" +
                    "\n" +
                    "9 to 15 years\n" +
                    "Colors\n" +
                    "\n" +
                    "The Himalayan has a light-colored body with darker facial mask, ears and tail, like the Siamese. Himmies come in a wide range of point colors, ranging from chocolate to lilac to red and everything in between. Unlike her Persian ancestor, the Himalayan Cat’s eyes only come in blue, like her Siamese ancestors.\n" +
                    "Shedding\n" +
                    "\n" +
                    "Himalayans shed, so daily grooming is essential to keep their long coat tangle- and mat-free and to remove the loose hair.\n" +
                    "Health\n" +
                    "\n" +
                    "Like other pedigreed cats, Himalayans have some health risks that may or may not be genetic in nature. Their facial structure in particular presents some unique health problems for the breed, including:\n" +
                    "\n" +
                    "    Breathing difficulties\n" +
                    "    Misaligned teeth\n" +
                    "    Excess eye watering and other eye conditions like entropion and progressive retinal atrophy\n" +
                    "\n" +
                    "In addition to the above, this breed also has a higher risk for the following health conditions:\n" +
                    "\n" +
                    "    Feline hyperesthesia syndrome\n" +
                    "    Heat sensitivity\n" +
                    "    Polycystic kidney disease\n" +
                    "    Higher risk for ringworm due to their long coats, which are harder to efficiently groom\n" +
                    "    Seborrhea oleosa, a skin condition that can cause red, itchy skin\n" +
                    "\n" +
                    "Choosing the Best Food for Himalayan Cats\n" +
                    "\n" +
                    "Although her long coat is beautiful, it does increase your Himmie’s risk of hairballs, so consider feeding her a cat food formulated to help control hairballs, like Pro Plan Focus Hairball Management Chicken & Rice Formula or Purina ONE Hairball Formula. Their sedentary nature can also lead to weight gain, so a weight control formula like Pro Plan Weight Management or Purina ONE Healthy Metabolism might be beneficial.\n" +
                    "\n" +
                    "To explore other products for your Himalayan, see our Product Selector.\n" +
                    "Choosing the Best Food for Himalayan Kittens\n" +
                    "\n" +
                    "For your Himalayan kitten, select a complete and balanced kitten food such as Purina Kitten Chow Nurture, Pro Plan Focus Kitten Chicken & Rice Formula or Purina ONE Healthy Kitten so she gets the essential nutrients needed for healthy growth and development during her first year of life.\n" +
                    "History\n" +
                    "\n" +
                    "In 1931, cat breeder Virginia Cobb, together with Dr. Clyde Keeler of Harvard, began crossing the Persian with the Siamese to study how the colorpoint gene was passed on. In the 1950s, breeders in Britain and North America worked to further develop the breed using Cobb’s and Keeler’s methods. Once the breed was firmly established, they sought recognition from cat associations.\n" +
                    "\n" +
                    "The Cat Fanciers Association (CFA) acknowledged the Himalayan as a distinct breed in 1957, but in 1984, reclassified the breed as a variety of Persian. The International Cat Association (TICA) recognizes the breed as part of their Persian group, but the American Cat Fanciers Association (ACFA) and other associations give the Himalayan her own group.\n" +
                    "Facts\n" +
                    "\n" +
                    "    The first Himalayan kitten was named “Newton’s Debutante”.\n" +
                    "    Himmies are the most popular pedigreed cat.\n" +
                    "    They are a manmade breed.\n",
            "Characteristics\n" +
                    "\n" +
                    "The most recognizable characteristics of adult Maine Coon cats are their large size and long, bushy tail. Their paws are big and well-tufted to be suitable for walking in snow, as can be seen in both adult and kitten Maine Coon cats. In addition, their ears are tufted, often with points of hair at the tips.\n" +
                    "Lifespan\n" +
                    "\n" +
                    "10 to 13 years\n" +
                    "Colors\n" +
                    "\n" +
                    "The most common color for Maine Coon cats is brown tabby. However, they can be nearly any color and pattern. Their eye colors, too, have a wide range from blue to green to gold, and can include odd-eyes (i.e. two different colored eyes).\n" +
                    "Shedding\n" +
                    "\n" +
                    "The coat of a Maine Coon cat is shorter on the shoulders and longer on the stomach. It’s smooth, shaggy and sheds moderately, though not more than other breeds with plush coats. While they do require frequent grooming, Main Coon cats love attention so they typically don’t mind being brushed.\n" +
                    "Health\n" +
                    "\n" +
                    "Maine Coon cats are generally a hardy breed of cat. They’re built for enduring cold, harsh New England winters. Maine Coons can suffer from hip dysplasia, with the abnormality affecting the larger males more than females.\n" +
                    "\n" +
                    "Spinal muscular atrophy is a potential health problem that can result in muscle atrophy and weakness. This condition is normally seen early in the Maine Coon kitten’s life. This feline is also more prone to developing hypertrophic cardiomyopathy than other breeds.\n" +
                    "Choosing the Best Food for Maine Coon Cats\n" +
                    "\n" +
                    "Pro Plan cat food offers several excellent options for feeding an adult Maine Coon Cat. Purina Pro Plan Adult Beef & Chicken Entrée in Gravy, for example, is high in protein and moisture content.\n" +
                    "\n" +
                    "To explore other products for your Maine Coon, see our Product Selector.\n" +
                    "Choosing the Best Food for Maine Coon Kittens\n" +
                    "\n" +
                    "For Maine Coon kittens, choose a food specially formulated for a kitten’s needs, like Purina Pro Plan Focus Kitten Ocean Whitefish & Tuna Entrée. The Pro Plan line offers many options, including both wet and dry food, specifically formulated to meet a kitten’s needs during her formative years.\n" +
                    "\n" +
                    "If you so desire, you can feed Maine Coon cats and kittens dry food in place of wet or as a supplement to occasional wet feedings. Always make sure there is plenty of fresh water available, of course.\n" +
                    "History\n" +
                    "\n" +
                    "Many folktales surround the history of Maine Coon cats. Some involve Marie Antoinette, others surround an English seafarer named Captain Coon. One genetically impossible myth claims Maine Coons are the result of domestic cats mating with raccoons.\n" +
                    "\n" +
                    "It is believed Maine Coon cats are descendants of domestic short-haired cats that bred with Scandinavian cats brought to North America by Norsemen. As such, the Maine Coon cat may be related to the Norwegian Forest Cat.\n" +
                    "Facts\n" +
                    "\n" +
                    "    In 1985, this all-American breed became the official state cat of Maine.\n" +
                    "    The winner of the first cat show in North America, at Madison Square Garden in 1895, was a Maine Coon cat.\n" +
                    "    The Maine Coon is not a cross between a cat and a raccoon.\n",
            "Temperament\n" +
                    "\n" +
                    "When exposed to new activities, people and animals from a young age, the Manx is adaptable and even enjoys meeting and greeting new people. She’s smart enough to learn tricks like fetch and walking on a leash. Your Manx makes a great road-trip companion, as she enjoys riding in cars, and she likes to play with water. She can learn to open doors and turn on faucets. As a people-oriented cat, she needs lots of attention so don’t leave her alone for hours at a time.\n" +
                    "Characteristics\n" +
                    "\n" +
                    "Although the breed is known for their lack of tail, not all Manx are tailless. Some have normal-length tails (known as “longies”) while others have nubs or stumps (called “stumpies”). The tailless Manx are called “rumpies” and a rumpy with a rise of bone at the end of her spine is called a “riser”.\n" +
                    "\n" +
                    "In addition to the variations in tail length, Manx are a round cat overall. They have a round head with large, round eyes, a stout body, broad chest, and round rear. Their front legs are much shorter than their hind legs, so their rear sits higher than their shoulders. Manx can have short or long coats. Longhaired Manx are called Cymric in some cat associations.\n" +
                    "Lifespan\n" +
                    "\n" +
                    "8 to 14 years\n" +
                    "Colors\n" +
                    "\n" +
                    "Manx cats come in a vast range of colors and patterns, from solids to tabbies to calicos. The pointed pattern (as seen in the Siamese) is not permitted, nor is chocolate or lavender.\n" +
                    "Shedding\n" +
                    "\n" +
                    "Manx cats shed, particularly during the spring and fall. Brush their double coat regularly to remove loose hair.\n" +
                    "Health\n" +
                    "\n" +
                    "The Manx is generally healthy, but they may suffer from some specific diseases and conditions, including:\n" +
                    "\n" +
                    "    Arthritis in the tailbone of “stumpies”\n" +
                    "    Corneal dystrophy, which develops at approximately 4 months of age\n" +
                    "    Manx syndrome, a collection of defects, which include a short spine, urinary tract problems, and difficulties with bowels and digestion. The syndrome affects approximately 20 percent of Manx and appears by 4 months of age.\n" +
                    "    Despite the lack of tail in rumpies, risers and stumpies, there are still nerve-endings there, which can make the area extremely sensitive.\n" +
                    "\n" +
                    "Choosing the Best Food for Manx Cats\n" +
                    "\n" +
                    "Your adult Manx cat requires complete and balanced nutrition to keep her healthy and active. Consider a cat food such as Purina Cat Chow Complete or opt for a weight management formula like Purina Cat Chow Indoor to help her maintain a healthy weight.\n" +
                    "\n" +
                    "To explore other products for your Manx cat, see our Product Selector.\n" +
                    "Choosing the Best Food for Manx Kittens\n" +
                    "\n" +
                    "Unlike most cat breeds, the Manx doesn’t reach full maturity for about 5 years. She only needs kitten food for the first year or so of her life, after which she can transition to a complete and balanced cat food for all life stages. During the first year of her life, feed her a complete and balanced kitten food to ensure she receives essential nutrients for healthy growth and development, such as Purina Kitten Chow Nuture.\n" +
                    "History\n" +
                    "\n" +
                    "Although their origin isn’t entirely known, records date the Manx to 1750 or later. The breed may have originated on the Isle of Man off the coast of Britain, or a tailless cat may have hitched a ride on a ship to the island, spreading her genes upon her arrival.\n" +
                    "\n" +
                    "The island became known for the tailless cats, which is how they got their name. It was one of the first cats represented at some of the first shows held in Great Britain and was one of the founding breeds of the Cat Fanciers Association (CFA) in 1906. It wasn’t recognized by The International Cat Association (TICA) until 1979 and is now recognized by many associations.\n" +
                    "Facts\n" +
                    "\n" +
                    "    The Manx is the only cat bred to be tail-free.\n" +
                    "    A genetic mutation is the cause of their tailless trait, which was intensified by the breed’s isolation and inbreeding.\n" +
                    "    Only rumpies and risers are permitted in the show ring",
            "Temperament\n" +
                    "\n" +
                    "The Sphynx is a sweet-natured, lively and inquisitive cat who loves being the center of attention. A devoted, loving lap cat, the Sphynx enjoys talking and following her human companions everywhere, and even likes to sleep under the covers with them.  \n" +
                    "\n" +
                    "Sphynx are playful and entertaining cats who usually get along fine with other family pets. They do not do well when left alone all day.\n" +
                    "Characteristics\n" +
                    "\n" +
                    "The most striking characteristic of the Sphynx is of course her hairlessness, which exposes her warm, chamois like skin for the world to see, touch and enjoy. Her wrinkled skin, exaggerated ears and large eyes give her face an otherworldly expression and wisdom.  \n" +
                    "Lifespan\n" +
                    "\n" +
                    "8 to 15 years\n" +
                    "Colors\n" +
                    "\n" +
                    "Sphynx colors include white, black, blue, red, cream, chocolate, lavender, cinnamon and fawn, plus various patterns and shadings.\n" +
                    "Shedding\n" +
                    "\n" +
                    "Though a non-shedding hairless breed, some Sphynx have a fine down on their bodies. Because they don’t have hair to absorb sebaceous oils secreted by a cat’s skin, they require bathing every few weeks with a natural, gentle shampoo.\n" +
                    "\n" +
                    "This should keep the Sphynx’s normally suede-like skin from becoming oily to the touch and developing problems. Sphynx also need special care to protect their skin from sun damage and cold.\n" +
                    "Health\n" +
                    "\n" +
                    "While Sphynx are generally healthy, they are at a higher risk for hypertrophic cardiomyopathy, the most common heart disease in cats. Responsible breeders will screen for this genetic condition, but it may not develop in their cats until later in life.\n" +
                    "Best Cat Food for Sphynx Cats & Kittens\n" +
                    "\n" +
                    "Sphynx will generally thrive on the nutrition of a quality adult cat food. For Sphynx who need help with weight management, consider a healthy weight formula.  \n" +
                    "\n" +
                    "Sphynx kittens should eat a kitten food for their first year of life to aid in their growth and development. \n" +
                    "History\n" +
                    "\n" +
                    "The origin of the Sphynx breed is actually a genetic mutation. In 1966 a domestic cat gave birth to a hairless kitten in Toronto, Canada, and the Sphynx breed was born.\n" +
                    "\n" +
                    "Hairlessness in cats is a recessive gene so breeding attempts to produce more hairless cats also produced cats with hair. The hairless cats were often referred to as Sphynx cats, an homage to the Egyptian cat sculpture they resembled.\n" +
                    "\n" +
                    "For more than 20 years this breed has been recognized by The International Cat Association (TICA). They were accepted for Championship class competition by The Cat Fanciers’ Association (CFA) in 2002.\n" +
                    "Facts\n" +
                    "\n" +
                    "    Even though they are hairless, Sphynx aren’t hypoallergenic. The protein Fel d 1, the source of most people’s cat allergies, is secreted through saliva and skin, not hair, by Sphynx as well as any other cat breed.\n" +
                    "    Because they are so friendly and cuddly, Sphynx are wonderful therapy pets.\n",
            "Temperament\n" +
                    "\n" +
                    "An active, playful feline, the Turkish Angora is sometimes called a ballerina among cats due to her gracefulness. One of the most extroverted cat breeds, she loves being the center of attention and enjoys entertaining her human companions.\n" +
                    "\n" +
                    "Angoras are intelligent athletes, and are top performers in agility. They are happy to share their home with other pets, as long as those pets understand that she is in charge.\n" +
                    "Characteristics\n" +
                    "\n" +
                    "An elegant, beautiful breed, the Turkish Angora has a soft, silky coat on a slender, finely-boned frame with a full, tapering tail.\n" +
                    "Lifespan\n" +
                    "\n" +
                    "12 to 18 years\n" +
                    "Colors\n" +
                    "\n" +
                    "White is the traditional color of the Turkish Angora, but coats can also come in black, blue, cream and red, plus various patterns and shadings.\n" +
                    "Shedding\n" +
                    "\n" +
                    "Turkish Angoras are a moderate-shedding breed, but their coats do not mat as easily as other longhair breeds, and are easy to groom. A weekly combing, and perhaps a bath every couple of months for white or light-colored Angoras, is all that’s needed to keep them looking show-ring ready.\n" +
                    "Health\n" +
                    "\n" +
                    "Turkish Angoras are generally healthy, long-lived cats. \n" +
                    "\n" +
                    "White Angoras with blue eyes are prone to deafness, while odd-eyed white Angoras may lose hearing in only one ear. Fortunately, with proper care cats with deafness can manage quite well and live long, healthy lives.\n" +
                    "\n" +
                    "Some Angoras may develop a heart condition called hypertrophic cardiomyopathy, which is the most common form of heart disease in cats. Responsible breeders should screen for this condition.\n" +
                    "Best Cat Food for Turkish Angora Cats & Kittens\n" +
                    "\n" +
                    "Turkish Angoras will generally thrive on the nutrition of a quality adult cat food. For Angoras who need help with weight management, consider a healthy weight formula.  \n" +
                    "\n" +
                    "Turkish Angora kittens should eat a kitten food for their first year of life to aid in their growth and development. \n" +
                    "History\n" +
                    "\n" +
                    "The Turkish Angora comes from the Turkish capital of Ankara, which was formerly known as Angora.\n" +
                    "\n" +
                    "The earliest written reference to this breed is from 16th century France, and during the late 1800s and early 1900s Angoras were popular with cat fanciers in Europe.\n" +
                    "\n" +
                    "Because Angoras were considered to be a national treasure in Turkey, the Ankara Zoo established a breeding program, focusing their efforts on preserving lines producing white cats with blue eyes, gold eyes and odd eyes. They were diligent in their efforts, but also fiercely protective about allowing their cats to go anywhere else.\n" +
                    "\n" +
                    "News of the exotic Turkish Angora reached the United States in the 1950s, through American servicemen who visited the Ankara Zoo. In 1962 the zoo allowed Colonel and Mrs. Walter Grant to bring home an odd-eyed white male named Yildiz and an amber-eyed white female named Yildizcek.\n" +
                    "\n" +
                    "These cats became the foundation of the breeding program in the United States.\n" +
                    "\n" +
                    "In 1968 The Cat Fanciers’ Association (CFA) began registering white Turkish Angoras, and in 1972 the CFA recognized them for championship status. Colored Turkish Angoras had to wait a bit longer—they were not recognized by the CFA until 1978.\n" +
                    "Facts\n" +
                    "\n" +
                    "    The Turkish Angora breed is named for the former Turkish capital of Angora, today known as Ankara.\n" +
                    "    Angoras actually enjoy playing in water. Some like splashing in the sink or hopping in the shower, while others have been known to willingly enter a body of water and paddle around.\n",
            "Singapura is an extroverted, playful feline sometimes called a “pesky people cat.” This breed thrives on attention and interactive play. Called Pura for short, these cats are intelligent and keenly observant. Friendly and social, they enjoy cats and cat friendly dogs, but dislike loud noises so are not ideal for busy households with boisterous children.",
            "Temperament\n" +
                    "\n" +
                    "They love to play with dogs, other pets and children. Their short legs actually give them an advantage, as it allows them to make tight maneuvers larger animals can’t.\n" +
                    "Characteristics\n" +
                    "\n" +
                    "With short legs and a long body, Munchkins look like the feline version of a Corgi or Dachshund. They have walnut-shaped eyes, triangular ears and can have either short or long coats.\n" +
                    "Lifespan\n" +
                    "\n" +
                    "12 to 15 years\n" +
                    "Colors\n" +
                    "\n" +
                    "The breed is maintained using an outcross program, which breeds other domestic cats with Munchkins to ensure gene diversity. As a result, these felines can come in an array of different colors and patterns.\n" +
                    "Shedding\n" +
                    "\n" +
                    "Munchkin cats will shed, particularly if they have a longer coat. They require combing twice a week to remove loose hair and to prevent tangles and matting. Comb short-haired Munchkins once a week.\n" +
                    "Health\n" +
                    "\n" +
                    "Despite its short legs and long back, Munchkin Cats do not have the spinal problems characteristic of dogs with short legs. Although they may not experience back problems, their genetic mutation does increase the risk of other health problems, including osteoarthritis caused by lordosis, or an inward curvature of the spine, and pectus excavatum, or “funnel chest”.  \n" +
                    "Choosing the Best Food for Munchkin Cats\n" +
                    "\n" +
                    "Munchkins need a complete and balanced diet, coupled with regular exercise, to maintain a healthy weight and avoid unnecessary stress on their joints. An adult cat food such as Purina Cat Chow Indoor, Purina Cat Chow Naturals Indoor or Purina Beyond Indoor Grain Free Salmon & Egg Recipe can help keep your Munchkin happy and healthy. Because of their short legs, your Munchkin kitty may need a shallower bowl than other breeds. If you have questions or concerns about your cat’s nutrition, consult with your veterinarian.\n" +
                    "\n" +
                    "To explore other products for your Munchkin, see our Product Selector.\n" +
                    "Choosing the Best Food for Munchkin Kittens\n" +
                    "\n" +
                    "Your Munchkin kitten will also need a complete and balanced food that provides all the nutrients she’ll need to become a healthy, mature cat. Kitten food like Purina Kitten Chow-Nature will aid in building strong bones, strong muscles, including a healthy heart, and other essential developments she’ll need to live a long and healthy life.\n" +
                    "History\n" +
                    "\n" +
                    "The first reports of cats with a genetic mutation causing short legs date back to the 1930s and 40s, but there was no trace of Munchkins throughout World War II. They resurfaced in the 1950s and 70s before being officially established as a breed in 1983.\n" +
                    "\n" +
                    "In 1994, The International Cat Association (TICA) accepted the cat into their new breed development program, and they achieved championship status in 2003. The Cat Fanciers Association (CFA) and American Cat Fanciers Association (ACFA) still do not recognize the Munchkin as a breed.\n" +
                    "Facts\n" +
                    "\n" +
                    "    The Munchkin Cat’s short legs are the result of a genetic mutation.\n" +
                    "    There are three different variations of the breed, depending on leg length.\n" +
                    "    Munchkins like to hoard small, shiny objects and hide them away for later.\n",
            "Temperament\n" +
                    "\n" +
                    "As a laid-back and independent breed, they don’t demand constant attention. Norwegian Forest Cats are content to simply sit in the same room with their humans and will happily entertain themselves while alone. These felines are moderately active, enjoying spurts of activity followed by long cat naps, and are happy to play in water. They get along with other dogs and cats, as well as mild-mannered children.\n" +
                    "Characteristics\n" +
                    "\n" +
                    "Their most distinguishing characteristic is their long, thick coat and large size. The Norwegian Forest Cat’s head is shaped like an inverted triangle, topped with heavily tufted medium-to-large ears.\n" +
                    "\n" +
                    "Large, almond-shaped eyes vary in color from stunning green to gold and copper. They have a large chest, muscular thighs, round paws, and a long, bushy tail.\n" +
                    "Lifespan\n" +
                    "\n" +
                    "14 to 16 years\n" +
                    "Colors\n" +
                    "\n" +
                    "The Norwegian Forest Cat’s coat comes in an array of different colors and patterns, except for color point (think Siamese).  \n" +
                    "Shedding\n" +
                    "\n" +
                    "Norwegian Forest Cats shed heavily a couple times per year, so regular brushing during this time is essential to remove loose fur. During non-shedding periods, brush their long coat one to two times per week, gently combing out tangles. Baths are rarely necessary, and their nearly waterproof coat makes it almost impossible.\n" +
                    "Health\n" +
                    "\n" +
                    "Norwegian Forest Cats may be at risk for one or more of the following diseases:\n" +
                    "\n" +
                    "    Glycogen storage disease IV\n" +
                    "    Hypertrophic cardiomyopathy\n" +
                    "    Polycystic kidney disease\n" +
                    "    Retinal dysplasia\n" +
                    "\n" +
                    "Choosing the Best Food for Norwegian Forest Cats\n" +
                    "\n" +
                    "Your Wegie needs a complete and balanced cat food formulated for her size and activity levels such as Pro Plan Savor or Pro Plan True Nature. Additionally, because of her long coat, she may need a food specially formulated to help control hairballs, like Pro Plan Focus Hairball Management or Purina ONE Hairball Formula, particularly during the shedding season.\n" +
                    "\n" +
                    "To explore other products for your Norwegian Forest Cat, see our Product Selector.\n" +
                    "Choosing the Best Food for Norwegian Forest Kittens\n" +
                    "\n" +
                    "Like many other large cat breeds, Norwegian Forest Cats do not fully mature until they reach 5 years of age. Although your Norwegian Forest kitten will transition to adult cat food before this, she needs a kitten food with all the nutrients she’ll need for proper growth and development, such as Purina Kitten Chow Nurture, Pro Plan Focus Kitten Chicken & Rice Formula or Purina ONE Healthy Kitten.\n" +
                    "History\n" +
                    "\n" +
                    "The Norwegian Forest Cat hails from Norway and originated hundreds (or even thousands) of years ago. There’s speculation about their ancestry. They may have descended from long-haired cats from Turkey, brought back to Norway by Scandinavian warriors serving the Byzantine Empire. Or, they may be related to the Siberian cat from Russia.\n" +
                    "\n" +
                    "The large feline was first exhibited at an Oslo cat show in 1938, but World War II interrupted plans to develop the breed further. Norwegian Forest Cats were finally registered as a breed in 1977 with Europe’s Federation Internationale Feline. They were exported to the U.S. in 1979 where their popularity quickly grew. In 1987, the breed was presented to the Cat Fanciers Association and was accepted for full champion status in 1993.\n" +
                    "Facts\n" +
                    "\n" +
                    "    The breed appears in a Norwegian fairy tale, which states the Norse goddess Freya’s chariot was pulled by these six giant cats.\n" +
                    "    In Norway, they’re called “skogcatts”, which translates to “forest cats”.\n" +
                    "    The Norwegian Forest Cat has been nicknamed “Wegie”.\n" +
                    "     King Olaf V designated the breed the official cat of Norway.\n",
            "Temperament \n" +
                    "\n" +
                    "They enjoy playful activities but are also content to drape themselves over an armchair rather than attempting to climb atop a bookcase. Persian kitties do well with mild-mannered children and laid-back dogs.\n" +
                    "Characteristics\n" +
                    "\n" +
                    "The Persian kitty has some distinct features, including a round head with a short face and snub nose. She also has chubby cheeks, big, round eyes and small, rounded ears. Persians have short, strong legs to support their sturdy bodies.\n" +
                    "Lifespan\n" +
                    "\n" +
                    "15 to 20 years\n" +
                    "Colors\n" +
                    "\n" +
                    "The original Persian Cat had shiny, gray fur. Due to selective breeding, however, they now boast an array of different colors. In fact, there are 7 different coat color divisions total for competition purposes.\n" +
                    "\n" +
                    "These range from silver and gold to white, smoky and solid-colored. Their eye color corresponds to their coat color. For example, white Persians tend to have deep blue or copper eyes, whereas silver or golden Persians have green eyes and solid-colored cats have copper eyes.\n" +
                    "Shedding\n" +
                    "\n" +
                    "Although they can shed a lot, proper grooming will prevent your Persian kitty from leaving hair all over your home. Comb her hair daily to prevent tangles and matting and to remove loose hair. Bathing once per month (after a thorough combing) will keep her coat and skin healthy and dirt free.\n" +
                    "Health\n" +
                    "\n" +
                    "The Persian’s facial structure can predispose her to a number of potential health complications, including:\n" +
                    "\n" +
                    "    Respiratory difficulties\n" +
                    "    Misaligned teeth\n" +
                    "    Eye conditions like excessive watering and entropion\n" +
                    "    Heat sensitivity\n" +
                    "\n" +
                    "Persians are also more susceptible to ringworm (because of their long coats), skin conditions that cause itching, redness and hair loss and polycystic kidney disease. Responsible breeders dedicate themselves to breeding healthy Persian Cats who are no more prone to illness and disease than other breeds, however.\n" +
                    "Choosing the Best Food for Persian Cats\n" +
                    "\n" +
                    "The flat face and short jaw of your Persian kitty may make it more difficult for her to eat dry kibble and drink enough water. Consider giving her a dry cat food like Purina ONE Hairball Formula or Pro Plan Focus Hairball Management Chicken & Rice Formula and supplementing with a wet cat food such as Pro Plan Focus Indoor Salmon & Rice Formula.  \n" +
                    "\n" +
                    "This will help ensure your Persian is getting all the nutrients she needs, while helping control hairballs caused by her long and luscious coat. When it comes to selecting a feeding bowl, opt for a wide, shallow dish or saucer with low sides.\n" +
                    "\n" +
                    "To explore other products for your Persian, see our Product Selector.\n" +
                    "Choosing the Best Food for Persian Kittens\n" +
                    "\n" +
                    "You’ll want to keep those chewing problems in mind when selecting a kitten food. In addition to being easy to eat and supporting hydration, it should also include essential nutrients your Persian kitty will need for her growth and development throughout her first year of life. A kitten food such as Pro Plan Focus Kitten Salmon & Ocean Fish Entrée Ground, Pro Plan Focus Kitten Whitefish & Tuna Entrée Flaked and Pro Plan Focus Kitten Chicken & Rice Formula will provide complete and balanced nutrition for your growing Persian kitty.\n" +
                    "History\n" +
                    "\n" +
                    "Persian Cats originated in Mesopotamia, which later became Persia and is now modern-day Iran. Their soft features and docile personality attracted the attention of Pietro Della Valle, an Italian nobleman who is credited with bringing these felines to Europe in the 17th century. The Persian kitty was a favorite of Queen Victoria and the breed was imported to the U.S. in the late 19th century.\n" +
                    "Facts\n" +
                    "\n" +
                    "    Modern Persian Cats are available in over 80 different color combinations.\n" +
                    "    The Persian participated in the first modern cat show, which took place in London in 1871.\n" +
                    "    There was a push in the U.S. to make the Silver Persian its own breed called “Sterling”. This was rejected, however, and silver and goldens are considered within the Persian category at cat shows.\n",
            "Temperament \n" +
                    "\n" +
                    "They may come when called and can even learn to play fetch. This sweet but playful feline prefers to remain on the same level as her people, rather than perched atop a bookcase or shelf. She’s good with children, other cats and dogs.\n" +
                    "Characteristics\n" +
                    "\n" +
                    "Ragdolls are one of the largest domestic cat breeds. They have a large head in a softer wedge shape than the sharp angular face of the Siamese.\n" +
                    "\n" +
                    "With a long, soft coat, oval-shaped blue eyes and medium-sized ears with rounded tips, their appearance matches their docile personality. They have a solid neck with a large and long, yet solid body, supported by a sturdy bone structure.\n" +
                    "Lifespan\n" +
                    "\n" +
                    "12 to 17\n" +
                    "Colors\n" +
                    "\n" +
                    "With point coloring similar to the Himalayan or Siamese breed, Ragdolls have light-colored bodies with darker extremities. With a color palette ranging from seal to blue to chocolate to cinnamon and more, the combinations of colors and patterns are almost endless. Ragdolls also have distinct blue eyes.\n" +
                    "Shedding\n" +
                    "\n" +
                    "Because Ragdoll Cats have little undercoat, they shed moderately throughout the year and more heavily in spring and fall. This also means less matting, but regular brushing is still necessary to keep the coat smooth, soft and free of tangles, mats and dead hair. If you’re gentle, your Ragdoll will adore the attention during grooming.\n" +
                    "Health\n" +
                    "\n" +
                    "Although DNA tests exist to help breeders weed out certain health problems, some complications may still arise for a Ragdoll. She may develop bladder stones or hypertrophic cardiomyopathy, a form of heart disease. Ragdolls also have a predisposition for feline infectious peritonitis.\n" +
                    "Choosing the Best Food for Ragdoll Cats\n" +
                    "\n" +
                    "Because of their large size, Ragdoll owners must provide their cats with a complete and balanced diet and plenty of playful exercise to maintain a healthy weight. Dry cat food options like Purina Cat Chow Indoor, Purina ONE Healthy Metabolism, Purina ONE Indoor Advantage or Pro Plan Focus Weight Management Chicken & Rice Formula can aid in weight management to keep your Ragdoll kitty happy and healthy. Supplementing with wet cat food like Pro Plan Weight Management Turkey & Rice Entrée Ground or Pro Plan Indoor Care Salmon & Rice Entrée in Sauce can help provide hydration for her most active days.   \n" +
                    "\n" +
                    "To explore other products for your Ragdoll, see our Product Selector.\n" +
                    "Choosing the Best Food for Ragdoll Kittens\n" +
                    "\n" +
                    "Ragdoll kittens don’t reach full maturity until they’re 3 to 4 years of age, but they should transition to an adult food before then. Your veterinarian can advise you when to make this transition. A kitten food that meets her unique nutritional needs during development will help her grow healthy and strong. Consider Pro Plan Focus Kitten Dry & Wet Formulas for your growing Ragdoll kitten. \n" +
                    "History\n" +
                    "\n" +
                    "Ann Baker, a breeder in California, developed the breed in the early 1960s using free-roaming cats she found in her neighborhood. As time went on, she grew eccentric and other breeders broke distanced themselves to maintain the integrity of the breed.\n" +
                    "\n" +
                    "In 1993, the breed was registered with the Cat Fanciers Association (CFA), receiving full recognition in 2000. The American Cat Fanciers Association (ACFA) and The International Cat Association (TICA) also recognized the breed.\n" +
                    "Facts\n" +
                    "\n" +
                    "    Ragdolls aren’t bred with any other breeds.\n" +
                    "    These felines get their name from the way they collapse limply into the arms of anyone holding them.\n" +
                    "    Ann Baker, the breeder credited with their origin, made outlandish claims about the Ragdoll, including influence from aliens, CIA experiments and infusions of human genes.\n",
            "Temperament \n" +
                    "\n" +
                    "Savannah Cats have strong hunting instincts, so they aren’t always suitable for households with pets like fish, hamsters, and birds. Her temperament is mild, though, so she’s a great companion to other cats and dogs, children and other humans in her home with proper socialization as a kitten.\n" +
                    "Characteristics \n" +
                    "\n" +
                    "Although later generations of the breed are similar in weight to other breeds, they appear larger due to their height. Savannah Cats are characterized by their long, slender necks, triangular heads and large, wide ears that sit on top of their heads. They also have longer-than-average legs.\n" +
                    "Lifespan \n" +
                    "\n" +
                    "12 to 20 years\n" +
                    "Colors \n" +
                    "\n" +
                    "If you want an exotic-looking cat, the Savannah is a beautiful choice. Resembling their African Serval ancestors, Savannahs are typically black, brown or silver tabbies with black or dark brown spots. Some may have lighter colors or a smoked pattern, however.\n" +
                    "Shedding \n" +
                    "\n" +
                    "Savannah Cats are a lower-shedding breed, and so they require less grooming than long-haired breeds. Because of their playful nature, however, they may get into a mess and need a bath. Fortunately, they love water!\n" +
                    "Health \n" +
                    "\n" +
                    "Savannah Cats are a healthy breed, with no known genetic conditions or other health problems. They are at risk of suffering from hypertrophic cardiomyopathy (thickening heart muscle) but are no more prone to heart problems than other cross-breeds. Responsible breeders screen for conditions that could negatively affect the breed.\n" +
                    "Choosing the Best Cat Food for Savannahs \n" +
                    "\n" +
                    "Because of their high activity levels, a high-protein cat food like Pro Plan Savor or True Nature Formula is recommended for Savannahs. Follow the feeding instructions based on your cat’s weight and consult with your veterinarian if you have any questions or concerns. Ensure your Savannah kitty has access to plenty of fresh water.\n" +
                    "\n" +
                    "To explore other products for your Savannah Cat, see our Product Selector.\n" +
                    "Choosing the Best Food for Savannah Kittens \n" +
                    "\n" +
                    "Savannah kittens are often bottle fed for the first four weeks of their lives due to prematurity in first generations. After that, kittens should eat a complete and balanced dry kitten food to aid in growth and development over the next three years, such as Pro Plan Focus Kitten Chicken & Rice Formula or Pro Plan Kitten Grain Free Chicken & Egg Recipe. Follow the feeding guidelines or consult with your veterinarian to ensure your kitten is eating an appropriate amount of food for her size.  \n" +
                    "History\n" +
                    "\n" +
                    "The Savannah Cat breed is a crossbreed of a domestic cat with an African Serval. The first kitten, named “Savannah”, was born on April 7, 1986 and the first generation possessed traits of both domestic cats and African Servals. They had the Serval’s size but the tameness of a domestic cat. In 2012, The International Cat Association (TICA) accepted the Savannah Cat as an official breed.\n" +
                    "Facts \n" +
                    "\n" +
                    "    The Savannah Cat’s back legs are slightly longer than her front legs.\n" +
                    "    It takes approximately 3 years for her to fully mature and reach adult size.\n" +
                    "    Savannahs are excellent jumpers. They can jump up to 8 feet horizontally and climb easily.\n" +
                    "    They are banned in several states, including Hawaii, Massachusetts and Georgia because of their “hybrid” status.\n" +
                    "    A first-generation Savannah Cat can cost more than $20,000. The cost for later generations is much lower, but can still top $1,000",
            "Temperament \n" +
                    "\n" +
                    "You may find this outgoing feline perched in strange postures, like lying flat on the floor with her legs splayed out, on her hind legs, sitting up like a meerkat or lying on her back, paws in the air.\n" +
                    "Characteristics\n" +
                    "\n" +
                    "A natural genetic mutation creates the unique folded ears for which Scottish Folds are known, but their ears work just as well as any other cat’s. They’re often described as resembling an owl. The ear folds range in appearance from a loose, single fold to tighter double and triple folds, which are closer to the head. Their folded ears may also appear perked. The Scottish Fold has a round face, round eyes and a round body.\n" +
                    "Lifespan\n" +
                    "\n" +
                    "11 to 15 years\n" +
                    "Colors\n" +
                    "\n" +
                    "The dense, plush and soft coat of the Scottish Fold comes in a full range of colors and patterns, including solid, tabby and more. Their coat color often dictates their eye color. For example, a white Fold will have blue eyes, whereas a red or brown tabby may have copper-colored eyes.\n" +
                    "Shedding\n" +
                    "\n" +
                    "Scottish Folds shed year-round, with heavier shedding periods during the spring and fall. Comb shorthaired Folds weekly to remove loose hair. Longhaired Folds may require grooming several times a week.\n" +
                    "Health\n" +
                    "\n" +
                    "Although responsible breeders do their best to eliminate serious diseases, the Scottish Fold may still suffer from degenerative joint disease, particularly in her tail, ankles and knees, as well as hypertrophic cardiomyopathy. Her folded ears make her more susceptible to ear infections.\n" +
                    "Choosing the Best Food for Scottish Folds\n" +
                    "\n" +
                    "Although Scottish Folds have a predisposition for joint disease, keeping your cat at a healthy weight can minimize the potential for future joint pain. Additionally, certain cat foods contain nutrients that promote healthy joints. Options like Pro Plan Focus Weight Management Chicken & Rice Formula or Purina ONE Healthy Metabolism will help your Fold maintain a healthy weight.\n" +
                    "\n" +
                    "To explore other products for your Scottish Fold, see our Product Selector.\n" +
                    "Choosing the Best Food for Scottish Fold Kittens\n" +
                    "\n" +
                    "Like any other breed, Scottish Fold kittens have specific nutritional needs to aid in their growth and development. Look for a complete and balanced kitten food like Purina Kitten Chow Nurture, Pro Plan Focus Kitten Chicken & Rice Formula or Purina ONE Healthy Kitten to provide her with all the essential nutrients she’ll need to grow healthy and strong. \n" +
                    "History\n" +
                    "\n" +
                    "Every Scottish Fold can trace her heritage back to a barn cat named “Susie”. She was a white cat with unique, folded ears, working as a mouser in a barn in the Tayside region of Scotland. She got the attention of William Ross, a shepherd, in 1961. He was given one of Susie’s kittens and named her “Snooks”.\n" +
                    "\n" +
                    "When Snooks eventually had kittens, one of the males was bred with a British Shorthair, which began the breed’s development. The mutated gene that results in the folded ears is dominant, so it produces the trademark ear folds about 50 percent of the time. In addition to this gene, Susie also passed down a gene for long hair. Longhaired cats are known as “Highland Folds” with some cat associations.\n" +
                    "\n" +
                    "Scottish Folds weren’t imported to the United States until the Early 1970s. By the mid 70s, they were recognized by most cat associations throughout North America.\n" +
                    "Facts\n" +
                    "\n" +
                    "    Scottish Folds were first known as “lop-eared cats”.\n" +
                    "    They are not recognized as a breed in Scotland due to concerns about an increased risk of ear infections and deafness.\n" +
                    "    Kittens are born with straight ears and the folds appear around 3 weeks of age. About 50 percent of a litter will have folded ears.\n" +
                    "    Only Folds with folded ears are permitted in show rings"
    };

    private static int[] catImages = {
            R.drawable.bengal,
            R.drawable.himalayan,
            R.drawable.maine_coon,
            R.drawable.manx,
            R.drawable.sphynx,
            R.drawable.angora,
            R.drawable.singapura,
            R.drawable.munchkin,
            R.drawable.norwegian_forest,
            R.drawable.persian,
            R.drawable.ragdoll,
            R.drawable.savannah,
            R.drawable.schottish_fold
    };

    public static String[] getCatNames() {
        return catNames;
    }

    public static String[] getCatDetails() {
        return catDetails;
    }

    public static int[] getCatImages() {
        return catImages;
    }

    public static String[] getCatHistory() {
        return catHistory;
    }

    static ArrayList<Cats> getListData() {
        ArrayList<Cats> list = new ArrayList<>();
        for (int position = 0; position < catNames.length; position++) {
            Cats cats = new Cats();
            cats.setName(catNames[position]);
            cats.setDetail(catDetails[position]);
            cats.setPhoto(catImages[position]);
            cats.setId(position);
            list.add(cats);
        }
        return list;
    }
}
