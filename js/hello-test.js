var expect = require ('expect.js');

function it(desc, fn) {
	try{
		fn();
	} catch (e) {
		console.log('assertion fails!');
	}
}

console.log('start running test');

it('3 should equal 4', function () {
	expect(3).to.equal(4);	
})






