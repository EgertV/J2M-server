INSERT INTO user VALUES(0, 'Alvar');
INSERT INTO user VALUES(1, 'Nelli');
INSERT INTO user VALUES(2, 'Egert');


INSERT INTO category VALUES(0, 'JavaScript');
INSERT INTO category VALUES(1, 'TypeScript');
INSERT INTO category VALUES(2, 'Angular');
INSERT INTO category VALUES(3, 'postgreSQL');

INSERT INTO skill (id, completed, data) VALUES(0, true, '{"name": "To be awesomest JavaScripter ever", "why": "Nortal needs awesome JavaScripters", "learningOutcomes": [ "You are awesome", "You are a JavaScripter", "You are what Nortal needs" ], "learningMaterials": { "chapters": [ { "heading": "First section about awesome knowledge", "paragraphs": [ "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum." ] } ], "videos": [ "https://www.youtube.com/watch?v=LaIAHOSKHCQ" ] }, "assignment": "To be the most awesomest JavaScripter ever, simply be awesome"}');


INSERT INTO skill VALUES(1, false, '{ "name": "To be awesomest JavaScripter ever", "why": "Nortal needs awesome JavaScripters", "learningOutcomes": [ "You are awesome", "You are a JavaScripter", "You are what Nortal needs" ], "learningMaterials": { "chapters": [ { "heading": "First section about awesome knowledge", "paragraphs": [ "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.", "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum." ] } ], "videos": [ "https://www.youtube.com/watch?v=LaIAHOSKHCQ" ] }, "assignment": "To be the most awesomest JavaScripter ever, simply be awesome" }');


INSERT INTO user_categories VALUES (0, 0);
INSERT INTO category_skills VALUES (0, 0);
INSERT INTO category_skills VALUES (0, 1);

INSERT INTO user_model_newcomers VALUES (2, 0);
INSERT INTO user_model_newcomers VALUES (2, 1);

